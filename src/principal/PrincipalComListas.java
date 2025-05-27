package principal;
import modelo.Filme;
import modelo.Serie;
import modelo.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        var meuFilme = new Filme("Interestelar", 2015);
        Serie lost = new Serie("Lost", 2000);
        Serie blackMirror = new Serie("BlackMirror", 2021);
        var filmeGustavo = new Filme("Os patetas", 2003);
        var velozesEFuriosos = new Filme("Velozes e Furiosos", 2010);

        blackMirror.avalia(8.76);
        filmeGustavo.avalia(10);
        meuFilme.avalia(8.3);
        lost.avalia(7.4);
        velozesEFuriosos.avalia(6.89);

        List<Titulo> lista = new LinkedList<>(); //Criando array list apenas com Filmes
        lista.add(filmeGustavo);
        lista.add(meuFilme);
        lista.add(velozesEFuriosos);
        lista.add(blackMirror);
        lista.add(lost);

        for (Titulo i : lista) {
            System.out.println(i.getNome());
            if (i instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Gustavo Kummer");
        buscaPorArtista.add("Nicole Gauziski");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Ordenando por ano");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
    }
}
