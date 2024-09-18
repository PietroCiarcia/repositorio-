import java.util.Scanner;

public class LogaritmoBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            double logaritmo = Math.log10(numero);

            Syst
