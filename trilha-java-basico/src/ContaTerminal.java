import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor! Digite o seu nome:");
            String username = scanner.next();
            System.out.println("Por favor! Digite o número da agência:");
            String agencyNumber = scanner.next();
            System.out.println("Por favor! Digite o sua conta:");
            int accountNumber = scanner.nextInt();
            System.out.println("Por favor! Digite o seu saldo:");
            double balanceAccount = scanner.nextDouble();
            saluteUser(username, agencyNumber, accountNumber, balanceAccount);
        }
    }
    static void saluteUser (String username, String agencyNumber, int accountNumber, double balanceAccount) {
        System.out.println("Olá " + username + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencyNumber + ", conta " + accountNumber + " e seu saldo " + balanceAccount + " já está disponível para saque");
    }
}
