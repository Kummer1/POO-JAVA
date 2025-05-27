package principal;
import requisicao.RequisicaoHttp;

import java.io.IOException;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        RequisicaoHttp requisicaoHttp = new RequisicaoHttp();
        requisicaoHttp.exibeFilme();

    }
}
