import java.util.Scanner;

public class CalculoIdad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        if (anoNascimento > anoAtual || anoNascimento < 0) {
            System.out.println("Ano de nascimento inválido. Por favor, digite um ano válido.");
        } else {
            int idade = anoAtual - anoNascimento;
            System.out.println("A idade da pessoa é: " + idade + " anos.");
        }

        scanner.close();
    }
}
