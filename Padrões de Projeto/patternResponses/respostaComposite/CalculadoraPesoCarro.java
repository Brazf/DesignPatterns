package respostaComposite;

public class CalculadoraPesoCarro {

	public static void main(String[] args) {
		// Criando as partes do carro
        Parte paraLamas = new Parte("Para-lamas", 10.5);
        Parte portas = new Parte("Portas", 20.2);
        Parte paineis = new Parte("Painéis", 15.0);
        Parte portaMalas = new Parte("Porta-malas", 30.7);
        Parte capo = new Parte("Capô", 12.3);
        Parte suspensao = new Parte("suspensao", 70.0);
        Parte motor = new Parte("Motor", 150.0);
        Parte transmissao = new Parte("Transmissão", 80.0);
        Parte diferencial = new Parte("Diferencial", 50.0);
        Parte rodas = new Parte("Rodas", 40.0);

        // Criando os compostos do carro
        Composto carroceria = new Composto("Carroceria");
        Composto chassi = new Composto("Chassi");
        Composto tremDeForca = new Composto("Trem de Força");

        // Adicionando as partes à carroceria
        carroceria.addParte(paraLamas);
        carroceria.addParte(portas);
        carroceria.addParte(paineis);
        carroceria.addParte(portaMalas);
        carroceria.addParte(capo);

        // Adicionando as partes ao chassi
        chassi.addParte(tremDeForca);
        chassi.addParte(suspensao);

        // Adicionando as partes ao trem de força
        tremDeForca.addParte(motor);
        tremDeForca.addParte(transmissao);
        tremDeForca.addParte(diferencial);
        tremDeForca.addParte(rodas);

        // Calculando o peso total do carro
        double pesoTotal = carroceria.getPeso() + chassi.getPeso();
        System.out.println("Peso total do carro: " + pesoTotal);
    }
	
}
