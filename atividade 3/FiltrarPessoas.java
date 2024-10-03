import java.util.Scanner;

public class FiltrarPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Pessoa " + i + ":");
            
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine();  
                        
            if (sexo == 'M' || sexo == 'm') {
                if (idade > 21) {
                    System.out.println("Nome: " + nome);
                }
            }
            
            System.out.println();  // Pula uma linha para separar as entradas
        }
        
        scanner.close();
    }
}
