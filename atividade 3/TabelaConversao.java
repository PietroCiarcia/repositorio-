public class TabelaConversao {
    public static void main(String[] args) {
        double conversaoPolegadaParaCm = 2.54;
        
        System.out.println("Tabela de Conversão de Polegadas para Centímetros");
        System.out.println("------------------------------------------------");
        System.out.printf("%-12s %-12s\n", "Polegadas", "Centímetros");         
        for (int i = 1; i <= 20; i++) {
            double centimetros = i * conversaoPolegadaParaCm;
            System.out.printf("%-12d %-12.2f\n", i, centimetros); 
        }
    }
}
