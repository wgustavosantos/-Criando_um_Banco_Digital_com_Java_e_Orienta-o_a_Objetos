package me.dio.web.projeto;

public abstract class Contas implements IConta{

    private static final int AGENCIA_PADRAO = 306;
    private static int SEQUENCIAL = 0;
    protected Clientes clientes;

    protected int agencia;
    protected int conta;
    protected double saldoReal;
    protected double saldoDolar;

    public Contas(Clientes clientes){
        this.agencia = Contas.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.clientes = clientes;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldoReal() {
        return saldoReal;
    }

    @Override
    public void sacarReal(double valor) {
        saldoReal -= valor;
    }

    @Override
    public void sacarDolar(double valor) {
        saldoDolar -= valor;
    }

    @Override
    public void comprarDolar(double valor) {
        double dolar = 5.37f;
        double dolaresComprados = valor / dolar;
        saldoReal -= valor;
        saldoDolar = dolaresComprados;
        System.out.println(String.format("Com R$: %.2f você comprou U$: %.2f", valor, dolaresComprados));
    }

    @Override
    public void depositar(double valor) {
        saldoReal += valor;
    }

    @Override
    public void depositarDolar(double valor) {
        saldoReal += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacarReal(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoesComuns() {
        System.out.println(String.format("Cliente: %s ", this.clientes.getNomeCliente()));
        System.out.println(String.format("Agencia: %d ", this.agencia));
        System.out.println(String.format("Conta: %d ", this.conta));
        System.out.println(String.format("Saldo R$: %.2f ", this.saldoReal));
    }
}