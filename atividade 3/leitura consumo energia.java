import java.util.Scanner;

public class LeituraConsumoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
              double totalConsumoResidencial = 0;
        double totalConsumoComercial = 0;
        double totalConsumoIndustrial = 0;
        int quantidadeConsumidoresResidencial = 0;
        int quantidadeConsumidoresComercial = 0;
        int quantidadeConsumidoresIndustrial = 0;
        
        while (true) {
           
            System.out.print("Digite o código do consumidor (0 para sair): ");
            int codigo = scanner.nextInt();
            
            if (codigo == 0) {
                break;              }
            
            System.out.print("Digite a quantidade de kWh consumidos: ");
            double consumo = scanner.nextDouble();
            
            System.out.print("Digite o tipo de consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
            int tipo = scanner.nextInt();
            
                       double precoPorKWh = 0;
            switch (tipo) {
                case 1:
                    precoPorKWh = 0.3; 
                    totalConsumoResidencial += consumo;
                    quantidadeConsumidoresResidencial++;
                    break;
                case 2:
                    precoPorKWh = 0.5;  
                                        totalConsumoComercial += consumo;
                    quantidadeConsumidoresComercial++;
                    break;
                case 3:
                    precoPorKWh = 0.7;                      totalConsumoIndustrial += consumo;
                    quantidadeConsumidoresIndustrial++;
                    break;
                default:
                    System.out.println("Tipo de consumidor inválido.");
                    continue;
            }
            
            // Cálculo e exibição do custo total para o consumidor atual
            double custoTotal = consumo * precoPorKWh;
            System.out.println("Custo total para o consumidor " + codigo + ": R$ " + String.format("%.2f", custoTotal));
        }
        
        // Exibindo os totais de consumo por tipo de consumidor
        System.out.println("\nTotais de consumo por tipo de consumidor:");
        System.out.println("Residencial: " + totalConsumoResidencial + " kWh");
        System.out.println("Comercial: " + totalConsumoComercial + " kWh");
        System.out.println("Industrial: " + totalConsumoIndustrial + " kWh");
        
        // Média de consumo para os tipos 1 e 2
        if (quantidadeConsumidoresResidencial > 0 && quantidadeConsumidoresComercial > 0) {
            double mediaConsumoResidencial = totalConsumoResidencial / quantidadeConsumidoresResidencial;
            double mediaConsumoComercial = totalConsumoComercial / quantidadeConsumidoresComercial;
            System.out.println("\nMédia de consumo:");
            System.out.println("Residencial: " + String.format("%.2f", mediaConsumoResidencial) + " kWh");
            System.out.println("Comercial: " + String.format("%.2f", mediaConsumoComercial) + " kWh");
        } else {
            System.out.println("\nNão foi 
