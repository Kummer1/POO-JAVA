import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;
import modelo.Episodio;
import modelo.Filme;
import modelo.Serie;
import calculos.CalculadoraDeTempo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("Interestelar");

        meuFilme.setAnoDeLancamento(2015);
        meuFilme.setDuracaoEmMinutos(150);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(7);
        meuFilme.avalia(8);
        meuFilme.avalia(5);

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());

        //System.out.println("Soma das avaliações: "+ meuFilme.somaDasAvaliacoes);
        //System.out.println("Total de avaliações "+ meuFilme.totalAvaliacoes);
        //System.out.println(String.format("Media das avaliações: %.2f ", meuFilme.pegaMedia()));

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(15);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Minutos para terminar lost: " + lost.getDuracaoEmMinutos());

        Serie blackMirror = new Serie();
        blackMirror.setNome("BlackMirror");
        blackMirror.setTemporadas(7);
        blackMirror.setEpisodiosPorTemporada(12);
        blackMirror.setMinutosPorEpisodio(55);
        blackMirror.setAnoDeLancamento(2021);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(blackMirror);
        calculadora.inclui(lost);

        System.out.println("O tempo total para maratonar todos do catálogo: " + calculadora.getTempoTotal());

        Episodio episodio1BlackMirror = new Episodio();
        episodio1BlackMirror.setNome("The national anthem");
        episodio1BlackMirror.setNumero(1);
        episodio1BlackMirror.setSerie(blackMirror);
        episodio1BlackMirror.setTotalVisualizacoes(1000000);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(episodio1BlackMirror);

        var filmeGustavo = new Filme();
        filmeGustavo.setDiretor("Gustavo Kummer");
        filmeGustavo.setNome("Os patetas");
        filmeGustavo.avalia(10);
        filmeGustavo.setAnoDeLancamento(2003);
        filmeGustavo.setDuracaoEmMinutos(120);

        var velozesEFuriosos = new Filme();
        velozesEFuriosos.setDuracaoEmMinutos(150);
        velozesEFuriosos.setDiretor("Gustavo Kummer");
        velozesEFuriosos.setAnoDeLancamento(2010);
        velozesEFuriosos.setNome("Velozes e Furiosos");
        velozesEFuriosos.avalia(9);

        ArrayList<Filme> filmes = new ArrayList<>(); //Criando array list apenas com Filmes
        filmes.add(filmeGustavo);
        filmes.add(meuFilme);
        filmes.add(velozesEFuriosos);

        System.out.println("O primeiro filme da lista é: " + filmes.get(0).getNome());
        // Explorando o conteúdo de listas pegando o primeiro filme do Array de filmes.

        for (Filme filme : filmes) {
            filme.exibeFichaTecnica();
        } // Exibe a ficha tecnica de cada um dos filmes do ArrayList
    }

}