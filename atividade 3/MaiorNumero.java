import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE;          
        while (true) {
            System.out.print("Digite um número (-9999 para parar): ");
            int numero = scanner.nextInt();
            
                       if (numero == -9999) {
                break;
            }
            
                       if (numero > maior) {
                maior = numero;
            }
        }
        
             System.out.println("O maior número digitado foi: " + maior);
        
        scanner.close();
    }
}
