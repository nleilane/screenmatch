import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {//public para ter acesso por qualquer classe ou pacote
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); //Criando objeto a partir da classe br.com.alura.screenmatch.modelos.Filme
        meuFilme.setNome("Joker");
        meuFilme.setAnoDeLancamento(2019);
        meuFilme.setDuracao(122);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: +" + meuFilme.getTotalDeAvalicoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());

    }
}
