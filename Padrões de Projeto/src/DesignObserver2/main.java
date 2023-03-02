package DesignObserver2;


public class main {
	
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		Investidor investidor = new Investidor();
		
		ServidorCotacao servidorCotacao = new ServidorCotacao();
		
		servidorCotacao.registerObserver(investidor);
		servidorCotacao.registerObserver(banco);
		
		servidorCotacao.novaCotacao( new Cotacao ("USD", 4));
		
	}
}
