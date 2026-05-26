package Bank;

import java.util.HashSet;
import java.util.Set;

import Bank.Client.Client;

public class Bank implements IBank {
    private Set<Client> listOfClients;
    private int ID_BANK;

    public Bank(int ID_BANK) {
        listOfClients = new HashSet<>();
        this.ID_BANK = ID_BANK;
    }
        
    @Override
    public void addNewClient(String nameClient) {
        Client client = new Client(nameClient);
        listOfClients.add(client);
    }
    @Override
    public void showClients() {
        if (!listOfClients.isEmpty()) {
            System.out.println(listOfClients);
        } else {
            System.out.println("Não há clientes no banco");
        }
    }

    @Override
    public Client getClient(String name) throws Exception {
        if (!listOfClients.isEmpty()) {    
            for (Client client : listOfClients) {
                if (client.getName().equalsIgnoreCase(name)) {
                    return client;
                }
            }

        } else {
            throw new Exception("Lista de clientes não existe!");
        }
        throw new Exception("Cliente não existe!");
    }
}
