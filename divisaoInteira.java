import java.util.Scanner;

public class DivisaoInteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo (número inteiro): ");
        int dividendo = scanner.nextInt();

        System.out.print("Digite o divisor (número inteiro diferente de zero): ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("O divisor não pode ser zero.");
        } else {
            int quociente = dividendo / divisor;
            int resto = dividendo % divisor;

            System.out.println("Dividendo: " + dividendo);
            System.out.println("Divisor: " + divisor);
            System.out.println("Quociente: " + quociente);
            System.out.println("Resto: " + resto);
        }

       