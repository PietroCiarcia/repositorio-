import java.util.Scanner;

public class LogaritmoGeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        double numero = scanner.nextDouble();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número positivo.");
            return;
        }

        System.out.print("Digite a base do logaritmo (número positivo diferente de 1): ");
        double base = scanner.nextDouble();

        if (base <= 0 || base == 1) {
            System.out.println("Por favor, digite uma base válida (número positivo diferente de 1).");
            return;
        }

        double logaritmo = Math.log(numero) / Math.log(base);

        System.out.printf("O logaritmo de %.2f na base %.2f é: %.4f%n", numero, base, logaritmo);

        scanner.close();
    }
}
