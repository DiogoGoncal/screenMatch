package com.screenmatch.main;

import com.screenmatch.calculos.CalculadoraTempo;
import com.screenmatch.calculos.FiltroRecomendacao;
import com.screenmatch.modelo.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Poderoso Chefão",1970);
        meuFilme.setDuracaoMinutos(180);
        meuFilme.setIncluidoPlano(true);


        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(90);


        meuFilme.exibeFichaTecnica();
        System.out.println("Duração: " + meuFilme.getDuracaoMinutos() + (" Minutos"));
        System.out.println("Média Avaliação: "+meuFilme.pegaMedia());
        System.out.println("Total de Avaliações: "+meuFilme.getTotalAvaliacao());

        Serie lost = new Serie("lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.exibeFichaTecnica();
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração de Maratona: " + lost.getDuracaoMinutos() + (" Minutos"));

        Filme outroFilme = new Filme("Avatar", 1923);

        outroFilme.setDuracaoMinutos(200);
        outroFilme.setIncluidoPlano(true);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeNovo = new Filme("Transformers", 2003);
        filmeNovo.setDuracaoMinutos(200);
        filmeNovo.avalia(7);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeNovo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primeiro filme: "+listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.toString());


    }
}