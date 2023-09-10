package br.com.screenmatch.main;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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


    }
}
