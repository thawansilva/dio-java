import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o parâmetro inicial: ");
        int startNumber = terminal.nextInt();
        System.out.println("Digite o parâmetro final: ");
        int finalNumber = terminal.nextInt();
        try {
            countInteration(startNumber, finalNumber);     
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            terminal.close();
        }
    }

    static void countInteration(int startNumber, int finalNumber) throws ParametrosInvalidosException {
        if (startNumber >= finalNumber)
            throw new ParametrosInvalidosException();

        int target = finalNumber - startNumber;
        for (int i = 0; i < target; i++) {
            System.out.printf("Imprimindo o número %d\n", i + 1);
        }
    }
}
