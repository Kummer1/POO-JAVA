import calculos.CalculadoraDeTempo;
import modelo.Filme;
import modelo.Serie;
import calculos.CalculadoraDeTempo;

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

        System.out.println("O tempo total para terminar as series e filmes é: " + calculadora.getTempoTotal());
    }

}