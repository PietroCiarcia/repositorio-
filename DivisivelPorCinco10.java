import java.util.Scanner;

public class DivisivelPorCinco10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 5 == 0) {
            System.out.println("O número " + numero + " é divisível por 5.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 5.");
        }

        scanner.close();
    }
}
