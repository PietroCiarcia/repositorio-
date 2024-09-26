import java.util.Scanner;

public class MultiploDeTres9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 3.");
        } else {
            System.out.println("O número " + numero + " não é múltiplo de 3.");
        }

        scanner.close();
    }
}
