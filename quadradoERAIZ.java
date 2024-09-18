import java.util.Scanner;

public class QuadradoERaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double quadrado = numero * numero;
        double raizQuadrada = Math.sqrt(numero);

        System.out.printf("Número: %.
