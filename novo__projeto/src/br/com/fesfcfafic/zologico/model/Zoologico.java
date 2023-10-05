package br.com.fesfcfafic.zologico.model;

public class Zoologico {
    private String nome;
    private Ambiente[] ambientes;

    public Zoologico(String nome, int numAmbientes) {
        this.nome = nome;
        this.ambientes = new Ambiente[numAmbientes];
    }

    public void adicionarAmbiente(Ambiente ambiente, int indice) {
        if (indice >= 0 && indice < ambientes.length) {
            ambientes[indice] = ambiente;
            System.out.println("Ambiente " + ambiente.nome + " foi adicionado ao zoológico " + nome);
        } else {
            System.out.println("Índice de ambiente inválido.");
        }
    }


}