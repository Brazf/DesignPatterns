package DesignBuilder;

public class Product {

	public static void main(String[] args) {
		
		Car carro1 = new Car(01, "Fiat", "Sedan", "Azul", 4, 1200.00, 1.20);
		
		System.out.println(carro1.toString());
		
		CarBuilder builder = new CarBuilder();

		builder.id(20).
			marca("Chevrolet").
			modelo("Hatch").
			cor("Vermelho").
			numPortas(4).
			peso(1500.00).
			altura(1.30);
		
		Car carro2 = builder.build();
		
		System.out.println(carro2);
	}
	
}
