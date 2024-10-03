import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                System.out.print("Digite o limite inferior (em graus Celsius): ");
        int limiteInferior = scanner.nextInt();
        
        System.out.print("Digite o limite superior (em graus Celsius): ");
        int limiteSuperior = scanner.nextInt();
        
        System.out.print("Digite o incremento (em graus Celsius): ");
        int incremento = scanner.nextInt();
        
                System.out.println("\nTabela de Conversão de Celsius para Fahrenheit");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-12s %-12s\n", "Celsius", "Fahrenheit");         
               for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.printf("%-12d %-12.2f\n", celsius, fahrenheit);
        }
        
        scanner.close();
    }
}
