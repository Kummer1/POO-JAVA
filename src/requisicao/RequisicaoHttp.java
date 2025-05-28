package requisicao;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import excecao.ErroDeConversacaoException;
import modelo.Titulo;
import modelo.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RequisicaoHttp {

    public void exibeFilme() throws IOException, InterruptedException {

        String buscaFilme = "";

        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create(); //CONVERTE A PRIMEIRA LETRA DA STRING

        while (!buscaFilme.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para busca: ");

            Scanner leitura = new Scanner(System.in);

            buscaFilme = leitura.nextLine();

            if (buscaFilme.equalsIgnoreCase("sair")){
                break;
            }

            String buscaCodificada = URLEncoder.encode(buscaFilme, StandardCharsets.UTF_8);
            //padroniza a URL

            try {
                String endereco = "https://www.omdbapi.com/?t=" + buscaCodificada + "&apikey=1c72e09e";

                HttpClient client = HttpClient.newHttpClient();
                //Cria um objeto HttpClient, responsável por enviar requisições HTTP.

                HttpRequest request = HttpRequest.newBuilder()
                        //1- Cria a requisição tipo GET e inicia a construção da requisição

                        .uri(URI.create(endereco))
                        //2- define onde ela será enviada

                        .build();
                //3-finalização da requisição}


                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                //Envia a requisição request e espera a resposta
                // Indica que a resposta enviada será do tipo String

                String json = response.body(); //cria variável que armazena o retorno em forma de String
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class); //Converte formato Json para classe Titulo

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Título já convertido: ");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Ocorreu um erro, mensagem do erro: ");
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Verifique o endereço do filme ");
                System.out.println(e.getMessage());

            } catch (ErroDeConversacaoException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos)); //converte a ArrayList para Json
        escrita.close();
        System.out.println("Encerrando programa");

    }
}

