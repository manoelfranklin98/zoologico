package br.com.fesfcfafic.zologico.model;

public class Pinguim extends AnimalAereo {
    public Pinguim(String nome, int idade) {
        super(nome, idade, "Pólo Sul", "Peixes", true);
    }

    @Override
    public void fazerBarulho() {
        System.out.println(nome + " está grasnando.");
    }
}
