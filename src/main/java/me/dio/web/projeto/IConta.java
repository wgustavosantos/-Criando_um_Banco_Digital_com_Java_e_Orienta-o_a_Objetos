package me.dio.web.projeto;

public interface IConta {

    //void calcularEmprestimo(double valor, int parcela);

    void comprarDolar(double valor);

    void sacarReal(double valor);

    void sacarDolar(double valor);

    void depositar(double valor);

    void depositarDolar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();
}
