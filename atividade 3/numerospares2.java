import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números pares você deseja imprimir? ");
        int quantidadePares = scanner.nextInt();
        
                System.out.println("Números pares:");
        for (int i = 1; i <= quantidadePares; i++) {
            System.out.print((i * 2) + " ");
        }
        
        scanner.close();
    }
}
