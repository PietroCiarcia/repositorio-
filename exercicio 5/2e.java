public class CaixaEletronico {
    public static void main(String[] args) {
        // Criando a Agência
        Agencia agencia = new Agencia("Agência Central", 7890);

        // Criando a Conta Corrente
        ContaCorrente contaCorrente = new ContaCorrente(1234, agencia, 150.00);

 

        // Operações
        // 1. Sacar 140.0 (sucesso)
        double valorSacado1 = contaCorrente.sacar(140.0);
        System.out.println("Valor sacado: " + valorSacado1);

        // 2. Consultar saldo (resultado é 10.0)
        double saldoAtual1 = contaCorrente.consultarSaldo();
        System.out.println("Saldo após saque: " + saldoAtual1);

        // 3. Sacar 200.0 (falha)
        double valorSacado2 = contaCorrente.sacar(200.0);
        System.out.println("Valor sacado: " + valorSacado2);

        // 4. Consultar saldo (resultado é 10.0)
        double saldoAtual2 = contaCorrente.consultarSaldo();
        System.out.println("Saldo após tentativa de saque: " + saldoAtual2);

        // 5. Depositar 25.45 (sucesso)
        contaCorrente.depositar(25.45);
        System.out.println("Depósito realizado.");

        // 6. Imprimir saldo
        System.out.println("Dados do cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        contaCorrente.imprimirSaldo(); // Imprime os dados da conta e saldo

        // Verificando saldo final
        double saldoFinal = contaCorrente.consultarSaldo();
        System.out.println("Saldo final: " + saldoFinal);
    }
}
