import java.util.Scanner;

public class MediaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int contador = 0;
        double media;
        
        while (true) {
            System.out.print("Digite um número positivo (ou um número negativo para sair): ");
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                break;  
            }
            
            soma += numero;              contador++;         }
        
        if (contador > 0) {
            media = (double) soma / contador;
            System.out.println("A média dos números digitados é: " + media);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }
        
        scanner.close();
    }
}
