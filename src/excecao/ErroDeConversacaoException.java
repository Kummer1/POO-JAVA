package excecao;

public class ErroDeConversacaoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversacaoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMessage(){
        return this.mensagem;
    }
}
