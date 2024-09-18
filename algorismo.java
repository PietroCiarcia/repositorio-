import java.util.Scanner;

public class AlgarismoDezena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 3 dígitos: ");
        int numero = scanner.nextInt();

        if (numero < 100 || numero > 999) {
            System.out.println("Por favor, digite um número válido com 3 dígitos.");
  
