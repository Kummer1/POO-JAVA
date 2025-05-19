package calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() > 4){
            System.out.println("Um dos melhores filmes!");
        }
        else if (classificavel.getClassificacao() >= 2){
            System.out.println("Bem avaliado no momento!");
        }
        else{
            System.out.println("Coloque na sua lista para ver depois");
        }
    }

}
