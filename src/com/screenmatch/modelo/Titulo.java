package com.screenmatch.modelo;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacao;
    private int duracaoMinutos;


    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void exibeFichaTecnica() {

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Incluido no plano: "+ (incluidoPlano ? "Sim" : "Não"));
    }
    public void avalia(double nota){

        somaAvaliacoes += nota;
        totalAvaliacao++;
    }
    public double pegaMedia(){
        return somaAvaliacoes/totalAvaliacao;
    }

    public int getTotalAvaliacao(){

        return totalAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
