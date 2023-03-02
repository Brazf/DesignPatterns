package DesignObserver2;

public class Banco implements iObserver{

	@Override
	public void notify(Cotacao cotacao) {
		
		System.out.println("Banco: " + cotacao);
		
	}

}
