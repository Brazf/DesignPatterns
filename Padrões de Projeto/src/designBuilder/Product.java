package designBuilder;

public class Product {

	public static void main(String[] args) {
		
		// CRIAÇÃO DO OBJETO SEM O PADRÃO DE PROJETO
		Car carro1 = new Car(01, "Fiat", "Sedan", "Azul", 2, 1200.00, 1.20);
		
		System.out.println(" - - - - Carro 1 - - - -");
		System.out.println(carro1);
		
		System.out.println("_____________________________________");
		
		// CRIAÇÃO DO OBJETO COM PADRÃO DE PROJETO
		CarBuilder builder = new CarBuilder();

		builder.id(2).
			marca("Chevrolet").
			modelo("Hatch");
		
		Car carro2 = builder.build();
		
		System.out.println(" - - - - Carro 2 - - - -");
		System.out.println(carro2);
		

		System.out.println("_____________________________________");
		
		// CONTINUAÇÃO ....
		// METHOD CHAINING
		
		Car carro3 = new CarBuilder().
				id(3).
				marca("Honda").
				modelo("Sedan").
				cor("Branco").
				numPortas(4).
				peso(990.00).
				altura(1.12).
				build();
		
		

		System.out.println(" - - - - Carro 3 - - - -");
		System.out.println(carro3);
		
		System.out.println("_____________________________________");
		
		
		// UTILIZANDO DO DIRECTOR PARA CRIAÇÃO DE OBJETOS
		
		CarBuilder builder2 = new CarBuilder();
		
		Director director = new Director();
		
		director.buildChevrolet(builder2);
		
		
		System.out.println("- - - - Carro 4 - - - -");
		
		System.out.println(builder2.build());
	}
	
}
