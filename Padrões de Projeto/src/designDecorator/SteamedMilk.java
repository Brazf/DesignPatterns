package designDecorator;

public class SteamedMilk extends CondimentDecorator{
	
	public SteamedMilk (Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + "Steamed Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()	+ 0.10;
	}
	
	
	
}
