package Screenmatch;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
    }

    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }
    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome= " + nome +
                ", anoDeLancamento= " + anoDeLancamento + ", " +
                "duração= " + duracaoEmMinutos + ")";
    }
}




