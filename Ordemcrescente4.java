import java.util.Scanner;

public class OrdemCrescente4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        num3 = scanner.nextInt();

        int menor, meio, maior;

        if (num1 < num2 && num1 < num3) {
            menor = num1;
            if (num2 < num3) {
                meio = num2;
                maior = num3;
    
