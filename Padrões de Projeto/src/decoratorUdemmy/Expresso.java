package decoratorUdemmy;

public class Expresso implements Drink{

	@Override
	public void server() {
		System.out.println("50 ml de expresso");
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1.5;
	}

}
