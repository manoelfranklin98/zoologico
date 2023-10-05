package br.com.fesfcfafic.zologico.model;

public abstract class Ambiente {
    protected String nome;
    protected int capacidade;
    protected Animal[] animais;

    public Ambiente(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.animais = new Animal[capacidade];
    }

    public abstract void adicionarAnimal(Animal animal);{
    }
}