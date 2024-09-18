import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida da diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();

        System.out.print("Digite a medida da diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;

        System.out.printf("A área do losango com diagonal maior %.2f e diagonal menor %.2f é: %.2f%n", 
                          diagonalMaior, diagonalMenor, area);

        scanner.close();
    }
}
