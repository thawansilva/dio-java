package dispositivos;
import aparelhotelefonico.AparelhoTelefonico;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    public void ligar() {
        System.out.println("Ligando para número");
    }
    public void atender() {
        System.out.println("Atendendo chamada");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }
    public void tocar() {
        System.out.println("Tocando música");     
    }
    public void pausar() {
        System.out.println("Pausando música");     
    }
    public void selecionarMusica() {
        System.out.println("Selecionando música");             
    }
}
