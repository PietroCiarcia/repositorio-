import java.util.Scanner;

public class Formato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia, mes, ano;

        System.out.print("Digite o dia: ");
        dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        ano = scanner.nextInt();

        System.out.println("A data é: " + dia + "/" + mes + "/" + ano);

        scanner.close();
    }
}
