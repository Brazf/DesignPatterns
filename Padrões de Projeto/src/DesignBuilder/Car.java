package DesignBuilder;

public class Car {

	private int id;
	private String marca;
	private String modelo;
	private String cor;
	private int numPortas;
	private double peso;
	private double altura;
	
	public Car(int id, String marca, String modelo, String cor, int numPortas, double peso, double altura) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.numPortas = numPortas;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Carro:\nid = " + id + "\nMarca = " + marca + "\nModelo = " + modelo + "\nCor = " + cor + "\nNumero de Portas = "
				+ numPortas + "\nPeso = " + peso + "KG" + "\nAltura = " + altura;
	}
	
	
	
}
