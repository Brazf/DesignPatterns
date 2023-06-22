package respostaFactory;

public class AmazoniaFactory implements LocalizacaoFactory{

	@Override
	public Inimigo criarInimigo() {
		return new AnimalMutante();
	}

}
