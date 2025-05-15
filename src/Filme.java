public class Filme {
    String nome;
    int anoDeLancamento;
    private double somaDasAvaliacoes;
    int duracaoEmMinutos;
    private int totalAvaliacoes;
    double mediaAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " +  nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }
    double pegaMedia(){
        return mediaAvaliacoes = somaDasAvaliacoes/totalAvaliacoes;
    }
}
