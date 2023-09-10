package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificavel;

//extends serve para puxar uma class
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    //Constructor
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    //Getter
    public String getDiretor(){
        return diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    //Pegou Classificacao está na interface
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    //Sobre escrevendo o toString(fonte da classe Filme"
    @Override
    public String toString() {
        return  "Filme: " + this.getNome()+ "(" + this.getAnoDeLancamento()+")";
    }
}