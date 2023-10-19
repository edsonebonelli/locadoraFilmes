package Screenmatch;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }
    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        temporadas = temporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodioPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
