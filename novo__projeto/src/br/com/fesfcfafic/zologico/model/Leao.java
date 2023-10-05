package br.com.fesfcfafic.zologico.model;

public class Leao extends AnimalTerrestre {
    public Leao(String nome, int idade) {
        super(nome, idade, "Savana", "Carnívoro", true);
    }

    @Override
    public void fazerBarulho() {
        System.out.println(nome + " está rugindo.");
    }
}
