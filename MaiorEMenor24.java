import java.util.Scanner;

public class MaiorEMenor24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;          
        int menor = Integer.MAX_VALUE;  
        
                for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

                        if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

               System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

              scanner.close();
    }
}
