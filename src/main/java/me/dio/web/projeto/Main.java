package me.dio.web.projeto;

public class Main {

    public static void main(String[] args) {

        Clientes cli1 = new Clientes();
        cli1.setNomeCliente("Gustavo");
        Contas cc = new ContaCorrente(cli1);
        Contas poupanca = new contaPoupanca(cli1);

        cc.imprimirExtrato();

        System.out.println("");

        poupanca.imprimirExtrato();

        poupanca.depositar(100);

        System.out.println("");

        poupanca.imprimirExtrato();

        System.out.println("");

        cc.depositar(500);

        cc.imprimirExtrato();

        System.out.println("");

        cc.comprarDolar(50);

        System.out.println("");

        cc.imprimirExtrato();

        cc.transferir(10,poupanca);
        cc.sacarDolar(3);

        poupanca.imprimirExtrato();
        cc.imprimirExtrato();

    }
}
