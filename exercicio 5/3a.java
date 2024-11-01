public class Termostato {
    // Atributo privado para armazenar a temperatura
    private int temperatura;

    // Construtor
    public Termostato() {
        this.temperatura = 22; // Temperatura inicial padrão
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
    
    
      // Atributos privados
    private Termostato termostato;
    private boolean ligado;

    // Construtor
    public CondicionadorDeAr() {
        this.termostato = new Termostato();
        this.ligado = false;
    }

    // Método de acesso para o atributo ligado
    public boolean isLigado() {
        return ligado;
    }

    // Método de acesso para o atributo termostato
    public Termostato getTermostato() {
        return termostato;
    }

    // Método para ligar o condicionador
    public void ligar() {
        ligado = true;
    }

    // Método para desligar o condicionador
    public void desligar() {
        ligado = false;
    }

    // Método para aumentar a temperatura
    public void aumentarTemperatura() {
        if (ligado) {
            termostato.aumentarTemperatura();
        } else {
            System.out.println("O condicionador está desligado. Não é possível aumentar a temperatura.");
        }
    }

    // Método para reduzir a temperatura
    public void reduzirTemperatura() {
        if (ligado) {
            termostato.reduzirTemperatura();
        } else {
            System.out.println("O condicionador está desligado. Não é possível reduzir a temperatura.");
        }
    }

    // Método para imprimir a temperatura atual
    public void imprimirTemperatura() {
        if (ligado) {
            System.out.println("Temperatura atual: " + termostato.getTemperatura() + "°C");
        } else {
            System.out.println("O condicionador está desligado. Não é possível imprimir a temperatura.");
        }
    }
}
