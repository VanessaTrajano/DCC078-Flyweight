package org.example;

public class Editora {

    private String nome;
    private String cidadeSede;

    public Editora(String nome, String cidadeSede) {
        this.nome = nome;
        this.cidadeSede = cidadeSede;
    }

    public String getNome() {
        return nome;
    }

    public String getCidadeSede() {
        return cidadeSede;
    }
}