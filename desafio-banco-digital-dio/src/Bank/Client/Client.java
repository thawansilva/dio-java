package Bank.Client;

import java.text.DecimalFormat;

import Bank.Account.CheckingAccount;
import Bank.Account.SavingAccount;

public class Client {
    private String name;
    private CheckingAccount ca;
    private SavingAccount sa;
    private String id_client;

    public Client(String name) {
        this.name = name;
        ca = new CheckingAccount();
        sa = new SavingAccount();
        id_client = new DecimalFormat("#").format(Math.random() * 100000);
    }
    public String getName() {
        return name;
    }
    public String getId_client() {
        return id_client;
    }
    public CheckingAccount getCheckingAccount() {
        return ca;
    }
    public SavingAccount getSavingAccount() {
        return sa;
    }
    public void showAllBankStatements() {
        System.out.println("---"+ this.name +"---");
        this.getCheckingAccount().showCommonInformations();
        this.getSavingAccount().showCommonInformations();
    }
    @Override
    public String toString() {
        return "{ Client name: " + name + ", id: " + id_client + "}";
    }
}