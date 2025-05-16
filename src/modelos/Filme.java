package modelos;

public class Filme {
    public String nome;
    int anoDeLancamento;
    private double somaDasAvaliacoes;
    int duracaoEmMinutos;
    private int totalAvaliacoes;
    double mediaAvaliacoes;

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " +  nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }
    public double pegaMedia(){
        return mediaAvaliacoes = somaDasAvaliacoes/totalAvaliacoes;
    }
}
