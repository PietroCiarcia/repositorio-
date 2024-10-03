import java.util.Scanner;

public class ContarNumerosPrimos {
    
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;  
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;              }
        }
        return true;      }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadePrimos = 0;  
        
        while (true) {
            System.out.print("Digite um número inteiro positivo (ou um número não positivo para parar): ");
            int numero = scanner.nextInt();
            
                       if (numero <= 0) {
                break;
            }
            
                      if (ehPrimo(numero)) {
                quantidadePrimos++;
            }
        }
        
        // Exibe a quantidade de números primos digitados
        System.out.println("Quantidade de números primos: " + quantidadePrimos);
        
        scanner.close();
    }
}
