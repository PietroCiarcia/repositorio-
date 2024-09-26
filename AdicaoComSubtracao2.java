import java.util.Scanner;

public class AdicaoComSubtracao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2, resultado;

        System.out.print("Digite o primeiro número: ");
        valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        valor2 = scanner.nextInt();

        resultado = valor1 + valor2;

        if (resultado <= 20) {
            resultado -= 5; 
        }

        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }
}
