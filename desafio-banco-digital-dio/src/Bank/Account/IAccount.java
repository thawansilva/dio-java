package Bank.Account;

import Bank.Bank;

public interface IAccount {
    void transferTypeAccount(Account typeAccount, double value) throws Exception;
    void transferToAnotherAccount(Bank bank, String targetAccountName, String typeAccount, double value) throws Exception;
    void withdraw(double value) throws Exception;
    void deposit(double value) throws Exception;
    void showCommonInformations();
}
