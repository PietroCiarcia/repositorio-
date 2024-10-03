import java.util.Scanner;

public class NumerosEntre100e200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;  // Contador de números entre 100 e 200
        int numero;
        
        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
            
            if (numero == 0) {
                break;  // Encerra o loop se o número digitado for 0
            }
            
            // Verifica se o número está entre 100 e 200
            if (numero >= 100 && numero <= 200) {
                contador++;
            }
        }
        
        // Exibe o resultado
        System.out.println("Foram digitados " + contador + " números entre 100 e 200.");
        
        scanner.close();
    }
}
