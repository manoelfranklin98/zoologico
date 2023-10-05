package br.com.fesfcfafic.zologico.model;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String habitat;
    protected String dieta;
    protected boolean vertebrado;

    public Animal(String nome, int idade, String habitat, String dieta, boolean vertebrado) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
        this.dieta = dieta;
        this.vertebrado = vertebrado;
    }

    public abstract void fazerBarulho();

    public abstract void mover();

    public void comer() {
        System.out.println(nome + " está se alimentando de " + dieta);
    }
}
