package br.com.fesfcfafic.zologico.model;

public abstract class AnimalAquatico extends Animal {
    public AnimalAquatico(String nome, int idade, String habitat, String dieta, boolean vertebrado) {
        super(nome, idade, habitat, dieta, vertebrado);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está nadando na água.");
    }
}
