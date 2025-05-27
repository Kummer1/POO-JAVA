package principal;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelo.TituloOmdb;
import modelo.Titulo;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=1c72e09e";

        HttpClient client = HttpClient.newHttpClient();
        //Cria um objeto HttpClient, responsável por enviar requisições HTTP.

        HttpRequest request = HttpRequest.newBuilder()
                //1- Cria a requisição tipo GET e inicia a construção da requisição

                .uri(URI.create(endereco))
                //2- define onde ela será enviada

                .build();
                //3-finalização da requisição

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //Envia a requisição request e espera a resposta
        // Indica que a resposta enviada será do tipo String

        String json = response.body(); //cria variável que armazena o retorno em forma de String
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create(); //CONVERTE A PRIMEIRA LETRA DA STRING

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class); //Converte formato Json para classe Titulo
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println(meuTitulo);
    }
}
