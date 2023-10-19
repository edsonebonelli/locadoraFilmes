package Principal;

import Calculos.CalculadoraDeTempo;
import Calculos.FiltroRecomendacao;
import Screenmatch.Episodio;
import Screenmatch.Filme;
import Screenmatch.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);

        var outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        var filmeDoEdson = new Filme("Mafia 3", 2003);
        filmeDoEdson.setDuracaoEmMinutos(200);

        var lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(22);
        lost.setMinutosPorEpisodio(50);

        var filtro = new FiltroRecomendacao();
        filtro.filtra(outroFilme);

        var episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);

        //CALCULANDO O TEMPO TOTAL DOS FILMES NO CATÁLOGO
        System.out.println();
        var calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(filmeDoEdson);
        System.out.println("O tempo total dos três filmes são: " + calculadora.getTempoTotal());

        //AVALIANDO O FILME
        System.out.println();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(4);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A média das avaliações é: " + meuFilme.pegaMedia());

        //CRIANDO ARRAY LIST
        System.out.println();
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoEdson);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("O tamanho da lista de filme é: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);

        //EXIBINDO FICHA TÉCNIA DA SÉRIE
        System.out.println();
        lost.exibeFichaTecnica();
    }
}