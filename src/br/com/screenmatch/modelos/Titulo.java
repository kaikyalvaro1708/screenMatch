package br.com.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    //Atributos precisos para filmes
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //Constructor
    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    //método acessor
    //GETTERS
    public int getTotalDeAvaliacoes (){
        return totalDeAvaliacoes;
    }
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
        return duracaoEmMinutos;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Criando um método
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        System.out.println("Avalicação: " + somaDasAvaliacoes);
    }

    /*método para avaliar filmes
    passa um argumento em double*/
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    //Compare - Titulo com outroTitulo
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
