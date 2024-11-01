public class Agencia {
    // Atributos privados
    private String nome;
    private int numero;
    private int digito;

    // Construtor
    public Agencia(String nome, int numero) {
        if (numero <= 0 || numero > 9999) {
            throw new IllegalArgumentException("O número da agência deve ser positivo e ter no máximo 4 dígitos.");
        }
        this.nome = nome;
        this.numero = numero;
        this.digito = calcularDigito(numero);
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    // Métodos modificadores (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        if (numero <= 0 || numero > 9999) {
            throw new IllegalArgumentException("O número da agência deve ser positivo e ter no máximo 4 dígitos.");
        }
        this.numero = numero;
        this.digito = calcularDigito(numero);  // Recalcula o dígito ao definir um novo número
    }

    // Método para calcular o dígito da agência usando o mesmo algoritmo de módulo 11
    private int calcularDigito(int numero) {
        // Convertendo o número da agência para uma string com padding para 4 dígitos
        String numeroStr = String.format("%04d", numero);

        // Multiplicando cada dígito pelos respectivos pesos
        int soma = (Character.getNumericValue(numeroStr.charAt(0)) * 4) +
                   (Character.getNumericValue(numeroStr.charAt(1)) * 6) +
                   (Character.getNumericValue(numeroStr.charAt(2)) * 8) +
                   (Character.getNumericValue(numeroStr.charAt(3)) * 2);

        // Calculando o módulo 11
        int resultado = soma % 11;

        // Se o resultado for 10, o dígito é 0
        return (resultado == 10) ? 0 : resultado;
    }
}
