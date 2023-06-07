package decoratorUdemmy;

public class Tea implements Drink{

	@Override
	public void server() {
		System.out.println("100 ml de chá");
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1.0;
	}
}
