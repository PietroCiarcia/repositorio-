import java.util.Scanner;

public class MaiorNumero8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else {
            System.out.println("O maior número é: " + numero2);
        }

        scanner.close();
    }
}
