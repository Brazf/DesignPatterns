package respostaDecorator;

public class BoloVariasCamandas extends CakeDecorator{

	Cake cake;
	
	public BoloVariasCamandas(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Multi-layered" + cake.getDescription();
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return cake.getCost()+5;
	}

}
