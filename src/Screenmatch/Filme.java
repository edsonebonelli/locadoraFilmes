package Screenmatch;

import Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int AnoDeLancamento) {
       super(nome, AnoDeLancamento);
    }
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public int getClassificacao(){
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
