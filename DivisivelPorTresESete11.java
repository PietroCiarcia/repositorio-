import java.util.Scanner;

public class DivisivelPorTresESete11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean divisivelPorTres = (numero % 3 == 0);
        boolean divisivelPorSete = (numero % 7 == 0);

        if (divisivelPorTres && divisivelPorSete) {
            System.out.println("O número " + numero + " é divisível por 3 e por 7.");
        } else if (divisivelPorTres) {
            System.out.println("O número " + numero + " é divisível por 3, mas não por 7.");
        } else if (divisivelPorSete) {
            System.out.println("O número " + numero + " é divisível por 7, mas não por 3.");
        } else {
            System.out.println("O número " + numero + " não é divisível nem por 3 nem por 7.");
        }

        scanner.close();
    }
}
