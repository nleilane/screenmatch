package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome; //atributo = caracteristica de um objeto
    private int anoDeLancamento;
    private Boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalicoes;
    private int duracao;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracao;
    }

    public int getTotalDeAvalicoes(){
        return  totalDeAvalicoes;
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

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicoes ++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvalicoes;
    }
}
