package respostaFactory;

public class SertaoFactory implements LocalizacaoFactory{

	@Override
	public Inimigo criarInimigo() {
		return new Cangaceiro();
	}

	
}
