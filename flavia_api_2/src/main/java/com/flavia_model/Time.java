package com.flavia_model;

import java.util.List;


public class Time {

    private String nome;
    private List<Atleta> atletas;

    public Time() {
    }

    public Time(String nome, List<Atleta> atletas) {
        this.nome = nome;
        this.atletas = atletas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }
}
