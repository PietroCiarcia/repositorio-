import java.util.Scanner;

public class Intervalo20a905 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 20 && numero <= 90) {
            System.out.println("O número " + numero + " está compreendido entre 20 e 90.");
        } else {
            System.out.println("O número " + numero + " não está compreendido entre 20 e 90.");
        }
        scanner.close();
    }
}
