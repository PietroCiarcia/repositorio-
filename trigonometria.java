import java.util.Scanner;

public class Trigonometria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        double anguloRadianos = Math.toRadians(anguloGraus);

        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tang
