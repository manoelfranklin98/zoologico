package br.com.fesfcfafic.zologico.Main;
import br.com.fesfcfafic.zologico.model.*;
public class Main {
    public static void main(String[] args) {

        Leao leao1 = new Leao("Leão Simba", 5);
        Pinguim pinguim1 = new Pinguim("Pingu", 3);
        Leao leao2 = new Leao("Leão Nala", 4);
        Pinguim pinguim2 = new Pinguim("Pinguin", 2);


        AmbienteAquatico aquario1 = new AmbienteAquatico("Aquário Grande", 3);
        AmbienteTerrestre savana1 = new AmbienteTerrestre("Savana Africana", 2);
        AmbienteAereo ceu1 = new AmbienteAereo("Céu Aberto", 5);


        aquario1.adicionarAnimal(pinguim1);
        aquario1.adicionarAnimal(pinguim2);
        savana1.adicionarAnimal(leao1);
        savana1.adicionarAnimal(leao2);

        
        Zoologico meuZoologico = new Zoologico("Zoo Central", 3);
        meuZoologico.adicionarAmbiente(aquario1, 0);
        meuZoologico.adicionarAmbiente(savana1, 1);
        meuZoologico.adicionarAmbiente(ceu1, 2);
    }
}
