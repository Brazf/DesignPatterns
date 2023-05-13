package decoratorUdemmy;

public class Milk extends DrinkDecorator{

	public Milk(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void server() {
		drink.server();
		System.out.println("30ml de leite");
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return drink.getPrice()+0.5;
	}
	

}
