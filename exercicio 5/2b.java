public class ContaCorrente {
    // Atributos privados
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    // Construtor
    public ContaCorrente(int numero, int digito, Agencia agencia, double saldoInicial) {
        this.numero = numero;
        this.digito = digito;
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
        this.numero = numero;
    }

    public void setDigito(int digito) {
        this.digito = digito;
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
}
