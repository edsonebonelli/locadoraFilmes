package Principal;

import Screenmatch.Filme;
import Screenmatch.Serie;
import Screenmatch.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        var meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);
        var outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoEdson = new Filme("Mafia 3", 2003);
        filmeDoEdson.avalia(10);
        var lost = new Serie("Lost", 2000);
        lost.avalia(8);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(filmeDoEdson);
        listaDeAssistidos.add(lost);
        for (Titulo item : listaDeAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Will Smit");
        buscaPorArtista.add("Bruce Waine");
        System.out.println(buscaPorArtista);
        System.out.println();
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);
        System.out.println("Ordenando por titulo");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(listaDeAssistidos);
    }
}

