import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.Recomendacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //chamando o objeto br.com.screenmatch.modelos.Filme
        Filme meuFilme = new Filme();
        meuFilme.setNome("Vingadores");
        meuFilme.setAnoDeLancamento(2012);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        //Exibe o método criado em br.com.screenmatch.modelos.Filme
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        //Exibe outro filme
        Filme outroFilme = new Filme();
        outroFilme.setNome("Interestelar");
        outroFilme.setAnoDeLancamento(2014);
        outroFilme.setDuracaoEmMinutos(180);
        outroFilme.avalia(10);

        //br.com.screenmatch.modelos.Serie
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println("O tempo total seria de " + calculadora.getTempoTotal() + " minutos");

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(1000);
        filtro.filtra(episodio);

        //Criando um array
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

    }
}
