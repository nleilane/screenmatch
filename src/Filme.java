public class Filme {
    String nome; //atributo = caracteristica de um objeto
    int anoDeLancamento;
    Boolean incluindoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvalicoes;
    int duracao;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicoes ++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvalicoes;
    }
}
