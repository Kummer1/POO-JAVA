package modelo;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    } //usa a interface classificavel para classificar os filme de 0  a 5 estrelas.


    @Override
    public String toString() {
        return "toString do Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
