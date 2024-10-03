import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para gerar a sequência de Fibonacci: ");
        int n = scanner.nextInt();
        
               if (n < 1) {
            System.out.println("Por favor, digite um número maior que 0.");
        } else {
            System.out.print("Sequência de Fibonacci até " + n + ": ");
            
           
            int a = 0, b = 1;
                       while (a <= n) {
                System.out.print(a + " ");
                               int temp = a;
                a = b;
                b = temp + b;
            }
        }
        
        scanner.close();
    }
}
