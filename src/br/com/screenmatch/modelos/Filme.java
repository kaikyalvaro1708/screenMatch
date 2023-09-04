package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificavel;

//extends serve para puxar uma class
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor(){
        return diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    //Pegou Classificacao está na interface
    @Override
    public int getClassificacao(){
        return (int) pegaMedia()/2;
    }

}