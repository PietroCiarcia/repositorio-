import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else {
            boolean ehPrimo = true;
            
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;  
                }
            }
            
            if (ehPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
