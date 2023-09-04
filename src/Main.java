public class Main {
    public static void main(String[] args){
        //chamando o objeto Filme
        Filme meuFilme = new Filme();
        meuFilme.setNome("Vingadores");
        meuFilme.setAnoDeLancamento(2012);
        meuFilme.setDuracaoEmMinutos(120);

        //Exibe o método criado em Filme
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.retornaMedia());

    }
}
