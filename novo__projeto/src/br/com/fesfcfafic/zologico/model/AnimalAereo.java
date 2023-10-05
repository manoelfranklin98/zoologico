package br.com.fesfcfafic.zologico.model;

public abstract class AnimalAereo extends Animal {
    public AnimalAereo(String nome, int idade, String habitat, String dieta, boolean vertebrado) {
        super(nome, idade, habitat, dieta, vertebrado);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está voando no céu.");
    }
}


