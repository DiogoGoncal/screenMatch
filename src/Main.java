import com.screenmatch.calculos.CalculadoraTempo;
import com.screenmatch.calculos.FiltroRecomendacao;
import com.screenmatch.modelo.Episodio;
import com.screenmatch.modelo.Filme;
import com.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();


        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoMinutos(180);
        meuFilme.setIncluidoPlano(true);


        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);


        meuFilme.exibeFichaTecnica();
        System.out.println("Duração: " + meuFilme.getDuracaoMinutos() + (" Minutos"));
        System.out.println("Média Avaliação: "+meuFilme.pegaMedia());
        System.out.println("Total de Avaliações: "+meuFilme.getTotalAvaliacao());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.exibeFichaTecnica();
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração de Maratona: " + lost.getDuracaoMinutos() + (" Minutos"));

        Filme outroFilme = new Filme();


        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(1923);
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

        Filme filmeNovo = new Filme();
        filmeNovo.setDuracaoMinutos(200);
        filmeNovo.setNome("Transformers");
        filmeNovo.setAnoLancamento(2003);
        filmeNovo.avalia(7);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeNovo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primeiro filme: "+listaDeFilmes.get(0).getNome());
    }
}