package designDecorator;

public class DarkRoaster extends Beverage{

	public DarkRoaster()	{
		description = "Dark Roaster Coffee";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

	
}
