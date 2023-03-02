package DesignObserver2;

public class Cotacao {

	private String moeda;
	private int valor;
	
	public Cotacao (String moeda, int valor) {
		this.moeda = moeda;
		this.valor = valor;
	}

	public String toString () {
		return "Cotacao{moeda="+this.moeda+", valor="+this.valor;
	}
}
