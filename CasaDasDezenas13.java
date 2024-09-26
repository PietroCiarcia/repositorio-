import java.util.Scanner;

public class CasaDasDezenas13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 3 casas decimais (0 a 999): ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 999) {
            System.out.println("Por favor, digite um número entre 0 e 999.");
        } else {
            int dezenas = (numero / 10) % 10;

            if (dezenas % 2 == 0) {
                System.out.println("O algarismo da casa das dezenas (" + dezenas + ") é par.");
            } else {
                System.out.println("O algarismo da casa das dezenas (" + dezenas + ") é ímpar.");
            }
        }

        scanner.close();
    }
}
