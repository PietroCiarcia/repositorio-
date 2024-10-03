import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
               int totalMenor21 = 0;
        int totalMaior50 = 0;
        
        while (true) {
            System.out.print("Digite a idade (0-120) ou um número fora desta faixa para parar: ");
            int idade = scanner.nextInt();
                       if (idade < 0 || idade > 120) {
                break;  
            }
            
           
            if (idade < 21) {
                totalMenor21++;
            }
            if (idade > 50) {
                totalMaior50++;
            }
        }
        
               System.out.println("Total de pessoas com menos de 21 anos: " + totalMenor21);
        System.out.println("Total de pessoas com mais de 50 anos: " + totalMaior50);
        
        scanner.close();
    }
}
