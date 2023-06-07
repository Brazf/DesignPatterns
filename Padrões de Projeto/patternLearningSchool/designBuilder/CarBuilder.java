package designBuilder;

public class CarBuilder implements Builder{

	private int id;
	private String marca;
	private String modelo;
	private String cor;
	private int numPortas;
	private double peso;
	private double altura;

	public CarBuilder id(int id) {
		this.id = id;
		return this;
	}
	
	public CarBuilder marca(String marca) {
		this.marca = marca;
		return this;
	}
	
	public CarBuilder modelo(String modelo) {
		this.modelo = modelo;
		return this;
	}
	
	public CarBuilder cor(String cor) {
		this.cor = cor;
		return this;
	}
	
	public CarBuilder numPortas(int numPortas) {
		this.numPortas = numPortas;
		return this;
	}
	
	public CarBuilder peso(double peso) {
		this.peso = peso;
		return this;
	}
	
	public CarBuilder altura(double altura) {
		this.altura = altura;
		return this;
	}

	public Car build () {
		return new Car (id, marca, modelo, cor, numPortas, peso, altura);
	}
	
	
}
