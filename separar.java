import java.util.Scanner;

public class SepararData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite uma data no formato ddmmaa: ");
        int data = scanner.nextInt();

        int dia = data / 10000;          
        int mes = (data / 100) % 100;   
        int ano = data % 100;            

      
        System.out.printf("Dia: %02d%n", dia);
        S
