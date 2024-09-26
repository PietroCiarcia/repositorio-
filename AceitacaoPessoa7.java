import java.util.Scanner;

public class AceitacaoPessoa7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu sexo (f para feminino, m para masculino): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if ((sexo == 'f' || sexo == 'F') && idade < 25) {
            System.out.println(nome + ", ACEITA.");
        } else {
            System.out.println(nome + ", NÃO ACEITA.");
        }

        scanner.close();
    }
}
