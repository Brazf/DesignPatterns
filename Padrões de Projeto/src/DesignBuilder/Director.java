package DesignBuilder;

public class Director {

	public void buildChevrolet ( CarBuilder builder) {

		builder.id(20).
				marca("Chevrolet").
				modelo("Hatch").
				cor("Vermelho").
				numPortas(4).
				peso(1500.00).
				altura(1.30);
	}
	
	public void buildFiat ( CarBuilder builder ) {
		
		builder.id(20).
				marca("Fiat").
				cor("Vermelho").
				numPortas(4).
				modelo("Sedan").
				peso(1250.00).
				altura(1.40);
	}

}
