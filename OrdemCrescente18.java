import java.util.Scanner;

public class OrdemCrescente18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 < numero2) {
            System.out.println("Números em ordem crescente: " + numero1 + ", " + numero2);
        } else {
            System.out.println("Números em ordem crescente: " + numero2 + ", " + numero1);
        }

        scanner.close();
    }
}
