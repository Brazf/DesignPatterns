package respostaFactory;

public class RioDeJaneiroFactory implements LocalizacaoFactory{

	public Inimigo criarInimigo() {
        return new Criminoso();
    }
}
