import java.util.Scanner;

public class Leianumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char milhar, centena, dezena, unidade;

        System.out.print("Digite o milhar (1 dígito): ");
        milhar = scanner.next().charAt(0);

        System.out.print("Digite a centena (1 dígito): ");
        centena = scanner.next().charAt(0);

        System.out.print("Digite a dezena (1 dígito): ");
        dezena = scanner.next().charAt(0);

        System.out.print("Digite a unidade (1 dígito): ");
        unidade = scanner.next().charAt(0);

        String numero = "" + milhar + centena + dezena + unidade;

        System.out.println("O número formado é: " + numero);

        scanner.close();
    
