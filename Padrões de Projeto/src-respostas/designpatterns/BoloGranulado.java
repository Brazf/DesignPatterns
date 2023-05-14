package designpatterns;

public class BoloGranulado extends CakeDecorator{
	
	Cake cake;
	
	public BoloGranulado (Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return cake.getDescription()+" with sprinkles";
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return cake.getCost()+2;
	}

}
