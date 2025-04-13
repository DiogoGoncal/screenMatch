package com.screenmatch.main;

import com.screenmatch.modelo.Filme;
import com.screenmatch.modelo.Serie;
import com.screenmatch.modelo.Titulo;

import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão",1970);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar", 1923);
        outroFilme.avalia(10);
        Filme filmeNovo = new Filme("Transformers", 2003);
        filmeNovo.avalia(5);
        Serie lost = new Serie("lost", 2000);

        ArrayList<Titulo> listaAssistido = new ArrayList<>();

        listaAssistido.add(filmeNovo);
        listaAssistido.add(meuFilme);
        listaAssistido.add(outroFilme);
        listaAssistido.add(lost);

        for(Titulo item: listaAssistido){
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação: "+filme.getClassificacao());
        }



    }
}
