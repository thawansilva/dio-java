package Bank.Account;

public class CheckingAccount extends Account {
    @Override
    public void showCommonInformations() {
        System.out.println("***Extrato Conta Corrente***");
        super.showCommonInformations();
    } 
}
