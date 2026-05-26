package Bank.Account;

import Bank.Bank;
import Bank.Client.Client;

public abstract class Account implements IAccount {
    private static int STANDARD_AGENCY = 1;
    private static int SEQUENCE = 1;
    protected int agency;
    protected int numberAccount;
    protected double balance;
    
    public Account() {
        this.agency = STANDARD_AGENCY;
        this.numberAccount = SEQUENCE++;
        this.balance = 0;
    }
    public double getBalance() {
        return balance;
    }
    public int getAgency() {
        return agency;
    }
    public int getNumberAccount() {
        return numberAccount;
    }

    @Override
    public void transferTypeAccount(Account typeAccount, double value) throws Exception {        
        if (balance >= value) {
            balance -= value;
            typeAccount.deposit(value);
        } else {
            throw new Exception("Valor a depositar é maior que o saldo.");
        }
    }

    @Override
    public void transferToAnotherAccount(Bank bank, String targetAccountName, String typeAccount, double value) throws Exception {
        if (balance >= value) {
            Client targetAccount = bank.getClient(targetAccountName);
            if (typeAccount.equalsIgnoreCase("saving")) {
                withdraw(value);
                targetAccount.getSavingAccount().deposit(value);
            } else {
                withdraw(value);
                targetAccount.getCheckingAccount().deposit(value);
            }
        } else {
            throw new Exception("Valor a depositar é maior que o saldo.");
        }
    }
    
    @Override
    public void withdraw(double value) throws Exception {
        if (balance >= value) {
            balance -= value;
        } else {
            throw new Exception("Valor a depositar é maior que o saldo.");
        }
    }

    @Override
    public void deposit(double value) throws Exception {
        if (value > 0) {
            balance += value;
        } else {
            throw new Exception("Valor de depósito inválido");
        }
    }    
    @Override
    public void showCommonInformations() {
        System.out.println(String.format("Agência: %d", this.agency));
        System.out.println(String.format("Número da conta: %d", this.numberAccount));
        System.out.println(String.format("Saldo: R$ %.2f\n", this.balance));
    }    
        
}
