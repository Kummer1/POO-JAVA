package principal;
import modelo.Filme;
import modelo.Serie;
import modelo.Titulo;
import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {

        ArrayList<Titulo> lista = getLista();

        for (Titulo i : lista) {
            System.out.println(i.getNome());
        }

        ArrayList<String> buscaPorAtores = new ArrayList<>();
        buscaPorAtores.add("Adam Sandler");
        buscaPorAtores.add("Gustavo Kummer");
        buscaPorAtores.add("Nicole Gauziski");
        buscaPorAtores.add("Ana Maria");

        Collections.sort(buscaPorAtores); //Ordena as Strings por ordem alfabética
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(buscaPorAtores);

        }

    private static ArrayList<Titulo> getLista() {
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

        ArrayList<Titulo> lista = new ArrayList<>(); //Criando array list apenas com Filmes
        lista.add(filmeGustavo);
        lista.add(meuFilme);
        lista.add(velozesEFuriosos);
        lista.add(blackMirror);
        lista.add(lost);
        return lista;
    }
}

