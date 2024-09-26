import java.util.Scanner;

public class MultiplosDeQuatro14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 4 casas (1000 a 9999): ");
        int numero = scanner.nextInt();

        if (numero < 1000 || numero > 9999) {
            System.out.println("Por favor, digite um número entre 1000 e 9999.");
        } else {
            int unidadeMilhar = (numero / 1000) % 10;            int centena = (numero / 100) % 10; 

            int numeroFormado = unidadeMilhar * 10 + centena;

            if (numeroFormado % 4 == 0) {
                System.out.println("O número formado " + numeroFormado + " é múltiplo de 4.");
            } else {
                System.out.println("O número formado " + numeroFormado + " não é múltiplo de 4.");
            }
        }

        scanner.close();
    }
}
