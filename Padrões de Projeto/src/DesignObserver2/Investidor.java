package DesignObserver2;

public class Investidor implements iObserver{
	
	@Override
	public void notify(Cotacao cotacao) {
		
		System.out.println("Investidor: " + cotacao);
		
	}

	
}
