package com.example.aluno.pestinha_app.model;

/**
 * Created by Aluno on 22/08/2017.
 */

public class Propriedade {
    private String nome;
    private int talhoes;
    private int talhoes_contaminados;

    public Propriedade(String nome, int talhoes,int talhoes_contaminados){
        this.nome = nome;
        this.talhoes = talhoes;
        this.talhoes_contaminados = talhoes_contaminados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTalhoes() {
        return talhoes;
    }

    public void setTalhoes(int talhoes) {
        this.talhoes = talhoes;
    }

    public int getTalhoes_contaminados() {
        return talhoes_contaminados;
    }

    public void setTalhoes_contaminados(int talhoes_contaminados) {
        this.talhoes_contaminados = talhoes_contaminados;
    }
}
