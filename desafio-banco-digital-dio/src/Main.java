import Bank.Bank;
import Bank.Client.Client;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creating banks
        Bank next = new Bank(222);
        Bank star = new Bank(342);
        
        // Adding clients in each bank
        next.addNewClient("Thawan");
        next.addNewClient("Leo");
        star.addNewClient("Maria");
        star.addNewClient("Fernanda");
        // Exhibiting clients of each bank
        star.showClients();
        next.showClients();
        // Accessing the clients
        Client thawan = next.getClient("Thawan");
        Client leo = next.getClient("Leo");
        Client maria = star.getClient("Maria");

        thawan.getCheckingAccount().deposit(100); // Depositing cash
        thawan.getCheckingAccount().transferTypeAccount(thawan.getSavingAccount(), 20); //Transfering to same account but different type
        thawan.getCheckingAccount().transferToAnotherAccount(next, leo.getName(), "saving", 20); //Transfering to another account but same bank
        thawan.getCheckingAccount().transferToAnotherAccount(star, maria.getName(), "checking", 30); // Transfering to another account in another bank
        
        // Showing balance
        thawan.showAllBankStatements();;
        leo.showAllBankStatements();
        maria.showAllBankStatements();
    }
}
