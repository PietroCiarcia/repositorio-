public class ContaCorrente {
    // Atributos privados
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    // Construtor
    public ContaCorrente(int numero, Agencia agencia, double saldoInicial) {
        if (numero <= 0 || numero > 9999) {
            throw new IllegalArgumentException("O número da conta deve ser positivo e ter no máximo 4 dígitos.");
        }
        this.numero = numero;
        this.digito = calcularDigito(numero);
        this.agencia = agencia;
        this.saldo = saldoInicial;
    }

    // Métodos de acesso (getters)
    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos modificadores (setters)
    public void setNumero(int numero) {
        if (numero <= 0 || numero > 9999) {
            throw new IllegalArgumentException("O número da conta deve ser positivo e ter no máximo 4 dígitos.");
        }
        this.numero = numero;
        this.digito = calcularDigito(numero);  // Recalcula o dígito ao definir um novo número
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Método para saque
    public double sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saque não efetuado. Saldo insuficiente.");
            return 0;
        } else {
            saldo -= valor;
            return valor;
        }
    }

    // Método para consultar saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para imprimir saldo e dados da conta
    public void imprimirSaldo() {
        System.out.println("Conta: " + numero + "-" + digito + ", Agência: " + agencia.getNumero() + "-" + agencia.getDigito() + ", Saldo: " + saldo);
    }

    // Método para calcular o dígito da conta usando o algoritmo de módulo 11
    private int calcularDigito(int numero) {
        // Convertendo o número da conta para uma string com padding para 4 dígitos
        String numeroStr = String.format("%04d", numero);

        // Multiplicando
