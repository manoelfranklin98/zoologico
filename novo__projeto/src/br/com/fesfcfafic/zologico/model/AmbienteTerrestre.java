package br.com.fesfcfafic.zologico.model;

public class AmbienteTerrestre extends Ambiente {
    public AmbienteTerrestre(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void adicionarAnimal(Animal animal) {
        for (int i = 0; i < capacidade; i++) {
            if (animais[i] == null) {
                animais[i] = animal;
                System.out.println(animal.nome + " foi adicionado ao ambiente terrestre " + nome);
                return;
            }
        }
        System.out.println("O ambiente terrestre " + nome + " está lotado.");
    }
}

