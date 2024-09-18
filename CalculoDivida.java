import java.util.Scanner;

public class CalculoDivida {
    public static void main(String[] args) {
        // Valores iniciais
        double valorInicial = 100.00; // R$ 100,00
        double taxaJuros = 10.0; // 10%
        int meses = 8; // 8 meses

        // Cálculo do valor final da dívida
        double valorFinal = valorInicial * Math.pow((1 + taxaJuros / 100), meses);

        // Exibição do resultado
        System.out.printf("Após %d meses, a dívida de R$ %.2f com juros de %.2f%% será R$ %.2f.%n", 
                          meses, valorInicial, taxaJuros, valorFinal);
    }
}
