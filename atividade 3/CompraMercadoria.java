import java.util.Scanner;

public class CompraMercadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalAPagar = 0;  
       
        while (true) {
            double preco = -1;  
            int quantidade = -1; 
            
                        while (preco <= 0) {
                System.out.print("Digite o preço da mercadoria (deve ser maior que zero): R$ ");
                preco = scanner.nextDouble();
                
                if (preco <= 0) {
                    System.out.println("Preço inválido! Digite um valor maior que zero.");
                }
            }
           
                       while (quantidade < 0) {
                System.out.print("Digite a quantidade de itens comprados (0 para finalizar): ");
                quantidade = scanner.nextInt();
                
                if (quantidade < 0) {
                    System.out.println("Quantidade inválida! Digite um valor maior ou igual a zero.");
                }
            }
            
                       if (quantidade == 0) {
                break;
            }
            
                       totalAPagar += preco * quantidade;
        }
      
              System.out.printf("O total a ser pago é: R$ %.2f\n", totalAPagar);
        
        scanner.close();
    }
}
