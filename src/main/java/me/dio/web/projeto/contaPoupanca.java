package me.dio.web.projeto;

public class contaPoupanca extends Contas{

    public contaPoupanca(Clientes clientes) {
        super(clientes);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("== Extrato conta poupança ==");
        super.imprimirInformacoesComuns();
    }
}