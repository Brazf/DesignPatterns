package DesignDecorator;

public class Whip extends CondimentDecorator{
	
	public Whip (Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + "Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()	+ 0.10;
	}
	
	
	
}
