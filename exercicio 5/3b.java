public class Termostato {
    // Atributo privado para armazenar a temperatura
    private int temperatura;

    // Construtor
    public Termostato() {
        this.temperatura = 20; // Temperatura inicial padrão
    }

    // Método para aumentar a temperatura
    public void aumentarTemperatura() {
        if (temperatura < 28) {
            temperatura++;
        }
    }

    // Método para reduzir a temperatura
    public void reduzirTemperatura() {
        if (temperatura > 15) {
            temperatura--;
        }
    }

    // Método para obter a temperatura atual
    public int getTemperatura() {
        return temperatura;
    }

    // Método para definir a temperatura, respeitando os limites
    public void setTemperatura(int temperatura) {
        if (temperatura >= 15 && temperatura <= 28) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Temperatura deve estar entre 15 e 28 graus.");
        }
    }
}
