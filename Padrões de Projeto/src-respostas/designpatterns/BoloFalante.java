package designpatterns;

public class BoloFalante extends CakeDecorator {

	Cake cake;
	String x;
	
	public BoloFalante (Cake cake, String x) {
		this.cake = cake;
		this.x = x;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return cake.getDescription()+" with saying " + x;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return cake.getCost();
	}
	
}
