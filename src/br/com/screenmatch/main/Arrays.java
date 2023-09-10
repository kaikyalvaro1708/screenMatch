package br.com.screenmatch.main;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.*;

public class Arrays {
    public static void main(String[] agrs){
        Filme meuFilme = new Filme("Vingadores",  2012);
        meuFilme.avalia(9);
        var outroFilme = new Filme("Interestelar", 2014);
        outroFilme.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        //Para cada var item que está dentro de lista, imprima item
        for (Titulo item: lista) {
            System.out.println(item);
            //Se ele for um filme, entao mostra a classificacao
            if ( item instanceof Filme filme && filme.getClassificacao() >= 6){
                System.out.println("Classificação: " +filme.getClassificacao());
            }

        }

        //New array
        List<String> buscaArtista = new LinkedList<>();
        buscaArtista.add("Adam Sandler");
        buscaArtista.add("Paulo");
        buscaArtista.add("Jacqueline");

        Collections.sort(buscaArtista); //Deixa em ordem alfabetica

        System.out.println("| Artistas Famosos:");
        System.out.println(buscaArtista);

        System.out.println("| Lista de Título ordenados: ");
        Collections.sort(lista); //Ordem alfabética
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); //Comparar os anos de lançamento
        System.out.println(lista);



    }
}
