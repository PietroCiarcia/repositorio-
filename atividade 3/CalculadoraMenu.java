import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número real: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double num2 = scanner.nextDouble();

        int opcao = 0; 
       
               while (opcao != 9) {
                       System.out.println("\nOperações Disponíveis:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("9. Sair do Programa");
            System.out.print("Digite o número de ordem da opção desejada: ");
            opcao = scanner.nextInt();

            
            switch (opcao) {
                case 1:
                                       double resultadoAdicao = num1 + num2;
                    System.out.printf("Resultado da Adição: %.2f\n", resultadoAdicao);
                    break;
                case 2:
                    
                    double resultadoSubtracao = num1 - num2;
                    System.out.printf("Resultado da Subtração: %.2f\n", resultadoSubtracao);
                    break;
                case 3:
                                        double resultadoMultiplicacao = num1 * num2;
                    System.out.printf("Resultado da Multiplicação: %.2f\n", resultadoMultiplicacao);
                    break;
                case 4:
                    
                    if (num2 != 0) {
                        double resultadoDivisao = num1 / num2;
                        System.out.printf("Resultado da Divisão: %.2f\n", resultadoDivisao);
                    } else {
                        System.out.println("Erro: Não é possível dividir por zero!");
                    }
                    break;
                case 9:
                                       System.out.println("Saindo do programa...");
                    break;
                default:
                                       System.out.println("Opção inválida! Tente novamente.");
            }
        }

           scanner.close();
    }
}
