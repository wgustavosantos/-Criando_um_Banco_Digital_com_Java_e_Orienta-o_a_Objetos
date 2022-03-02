package me.dio.web.projeto;

import java.util.List;

public class Banco {

    private String nomeBanco;
    protected List<Contas> contas;

    public String getNomeBanco() {
        return nomeBanco;
    }

    public List<Contas> getContas() {
        return contas;
    }

    public void setContas(List<Contas> contas) {
        this.contas = contas;
    }
}