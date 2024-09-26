import java.util.Scanner;

public class RaizOuQuadradA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
        } else {
            double quadrado = numero * numero;
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
        }

        scanner.close();
    }
}
