package me.dio.web.projeto;

public class Clientes{

    private String nomeCliente;

    public Clientes() {
    }

    public Clientes(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}