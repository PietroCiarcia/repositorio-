import java.util.Scanner;

public class RaizQuadradaEInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numero;
        
        while (true) {
            System.out.print("Digite um número (ou -999 para sair): ");
            numero = scanner.nextDouble();
            
            // Verifica se o número é -999, caso seja, encerra o loop
            if (numero == -999) {
                break;
            }
            
            // Verifica se o número é não negativo para calcular a raiz quadrada
            if (numero >= 0) {
                double raizQuadrada = Math.sqrt(numero);
                System.out.println("Raiz quadrada de " + numero + ": " + raizQuadrada);
            } else {
                System.out.println("Número negativo, não é possível calcular a raiz quadrada.");
            }

            // Verifica se o número é diferente de 0 para calcular o inverso
            if (numero != 0) {
                double inverso = 1 / numero;
                System.out.println("Inverso de " + numero + ": " + inverso);
            } else {
                System.out.println("Inverso de 0 não é definido.");
            }
        }
        
        scanner.close();
    }
}
