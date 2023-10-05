package br.com.fesfcfafic.zologico.model;

public abstract class AnimalTerrestre extends Animal {
    public AnimalTerrestre(String nome, int idade, String habitat, String dieta, boolean vertebrado) {
        super(nome, idade, habitat, dieta, vertebrado);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está se movendo na terra.");
    }
}
