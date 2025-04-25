package com.screenmatch.main;

import com.screenmatch.modelo.Filme;
import com.screenmatch.modelo.Serie;
import com.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainLists {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão",1970);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar", 1923);
        outroFilme.avalia(10);
        Filme filmeNovo = new Filme("Transformers", 2003);
        filmeNovo.avalia(5);
        Serie lost = new Serie("lost", 2000);

        List<Titulo> listaAssistido = new ArrayList<>();

        listaAssistido.add(filmeNovo);
        listaAssistido.add(meuFilme);
        listaAssistido.add(outroFilme);
        listaAssistido.add(lost);

        for (Titulo item: listaAssistido) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Diogo");
        buscaArtista.add("Pedro");
        buscaArtista.add("João");
        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);

        System.out.println("Depois da ordenação");
        System.out.println(buscaArtista);

        Collections.sort(listaAssistido);
        System.out.println(listaAssistido);
        listaAssistido.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(listaAssistido);
    }
}
