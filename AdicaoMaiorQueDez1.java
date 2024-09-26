import java.util.Scanner;

public class AdicaoMaiorQueDez1 {
    public static void main(String[] args) {
        // Criação do scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int valor1, valor2, resultado;

        // Leitura dos valores
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();

        // Cálculo da adição
        resultado = valor1 + valor2;

        // Verificação se o resultado é maior que 10
        if (resultado > 10) {
            System.out.println("O resultado da adição é: " + resultado);
        }

        // Fechamento do scanner
        scanner.close();
    }
}
