package Bank.Account;

public class SavingAccount extends Account {
    @Override
    public void showCommonInformations() {
        System.out.println("***Extrato Conta Poupança***");
        super.showCommonInformations();
    } 
}
