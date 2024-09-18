import java.util.Scanner;

public class EmbaralharFrases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira frase: ");
        String frase1 = scanner.nextLine();
        
        System.out.print("Digite a segunda frase: ");
        String frase2 = scanner.nextLine();
        
        System.out.print("Digite a terceira frase: ");
        String frase3 = scanner.nextLine();

        String metade1A = frase1.substring(0, frase1.length() / 2);
        String metade1B = frase1.substring(frase1.length() / 2);

        String metade2A = frase2.substring(0, frase2.length() / 2);
        String metade2B = frase2.substring(frase2.length() / 2);

        String metade3A = frase3.substring(0, frase3.length() / 2);
        String metade3B = frase3.substring(frase3.length() / 2);

        String fraseEmbaralhada = metade2A + metade3B + metade2B + metade1A + metade3A + metade1B;

        String frasesConcatenadas = frase1 + " " + frase2 + " " + frase3;

        System.out.println("Frases originais concatenadas: " + frasesConcatenadas);
        System.out.println("Frase embaralhada: " + fraseEmbaralhada);

        scanner.close();
    }
}
