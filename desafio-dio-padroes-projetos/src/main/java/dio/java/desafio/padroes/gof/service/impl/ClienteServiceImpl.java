package dio.java.desafio.padroes.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.java.desafio.padroes.gof.model.Cliente;
import dio.java.desafio.padroes.gof.model.ClienteRepository;
import dio.java.desafio.padroes.gof.model.Endereco;
import dio.java.desafio.padroes.gof.model.EnderecoRepository;
import dio.java.desafio.padroes.gof.service.ClienteService;
import dio.java.desafio.padroes.gof.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository; 
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired ViaCepService viaCepService; 

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }
    
    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }
    
    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteDB = clienteRepository.findById(id);
        if (clienteDB.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereço = viaCepService.consultaCep(cep);
            enderecoRepository.save(novoEndereço);
            return null;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }    
}
