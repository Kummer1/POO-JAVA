import modelo.Filme;

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
    }
}