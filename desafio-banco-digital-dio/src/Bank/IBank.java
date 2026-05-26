package Bank;

import Bank.Client.Client;

public interface IBank {
    Client getClient(String name) throws Exception;
    void addNewClient(String nameClient);
    void showClients();
}