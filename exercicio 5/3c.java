public class Usuario {
    public static void main(String[] args) {
        // Instanciando o Condicionador de Ar
        CondicionadorDeAr condicionador = new CondicionadorDeAr();

        // Tentando aumentar a temperatura para 30 graus (deve receber mensagem de erro)
        System.out.println("Tentando aumentar a temperatura para 30 graus...");
        for (int i = 0; i < 11; i++) {
            condicionador.aumentarTemperatura(); // Aumenta a temperatura até o limite
        }
        // Tentativa de aumentar a temperatura além do limite
        condicionador.getTermostato().setTemperatura(30); // Deveria imprimir mensagem de erro

        // Tentando reduzir a temperatura para 10 graus (deve receber mensagem de erro)
        System.out.println("Tentando reduzir a temperatura para 10 graus...");
        for (int i = 0; i < 20; i++) {
            condicionador.reduzirTemperatura(); // Reduz a temperatura até o limite
        }
        // Tentativa de reduzir a temperatura abaixo do limite
        condicionador.getTermostato().setTemperatura(10); // Deveria imprimir mensagem de erro

        // Aumentando a temperatura para 25 graus
        System.out.println("Aumentando a temperatura para 25 graus...");
        condicionador.getTermostato().setTemperatura(25);

        // Imprimindo a temperatura atual
        System.out.println("Temperatura atual: " + condicionador.getTermostato().getTemperatura() + "°C");
    }
}
