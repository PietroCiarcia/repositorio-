import java.util.Scanner;

public class Divisibilidade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean divisivelPor10 = (numero % 10 == 0);
        boolean divisivelPor5 = (numero % 5 == 0);
        boolean divisivelPor2 = (numero % 2 == 0);

        if (divisivelPor10) {
            System.out.println("O número " + numero + " é divisível por 10.");
        } else if (divisivelPor5) {
            System.out.println("O número " + numero + " é divisível por 5.");
        } else if (divisivelPor2) {
            System.out.println("O número " + numero + " é divisível por 2.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 10, 5 ou 2.");
        }

        scanner.close();
    }
}
