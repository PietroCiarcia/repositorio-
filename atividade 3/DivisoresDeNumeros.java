import java.util.Scanner;

public class DivisoresDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        while (true) {
            System.out.print("Digite um número (ou -999 para sair): ");
            numero = scanner.nextInt();
            
            if (numero == -999) {
                break;  // Encerra o loop se o número digitado for -999
            }
            
            System.out.println("Divisores de " + numero + ": ");
           
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");                 }
            }
            System.out.println();        }
        
        scanner.close();
    }
}
