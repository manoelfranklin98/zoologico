package br.com.fesfcfafic.zologico.model;

public class AmbienteAquatico extends Ambiente {
    public AmbienteAquatico(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public void adicionarAnimal(Animal animal) {
        for (int i = 0; i < capacidade; i++) {
            if (animais[i] == null) {
                animais[i] = animal;
                System.out.println(animal.nome + " foi adicionado ao ambiente aquático " + nome);
                return;
            }
        }
        System.out.println("O ambiente aquático " + nome + " está lotado.");
    }
}