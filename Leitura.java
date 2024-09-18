import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        System.out.println("O valor do número digitado é: " + numero);

        scanner.close();
    }
}
