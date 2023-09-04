package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

   /* public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }
    public void inclui(Serie s){
        tempoTotal += s.getDuracaoEmMinutos();
    }*/

    //Serie e Filme são filhos de Titulo
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
