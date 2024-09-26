import java.util.Scanner;

public class QuadradoERaiz20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double menor, maior;

        if (numero1 < numero2) {
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }

        double quadrado = menor * menor;
        System.out.println("O quadrado do menor número (" + menor + ") é: " + quadrado);

        if (maior >= 0) {
            double raizQuadrada = Math.sqrt(maior);
            System.out.println("A raiz quadrada 
