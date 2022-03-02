package me.dio.web.projeto;

public class ContaCorrente extends Contas {

    public ContaCorrente(Clientes clientes) {
        super(clientes);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("== Extrato conta corrente ==");
        super.imprimirInformacoesComuns();
        System.out.println(String.format("Saldo U$: %.2f", super.saldoDolar));
    }
}