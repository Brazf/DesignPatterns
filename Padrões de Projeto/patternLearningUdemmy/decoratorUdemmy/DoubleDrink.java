package decoratorUdemmy;

public class DoubleDrink extends DrinkDecorator{

	public DoubleDrink(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void server() {
		drink.server();
		drink.server();
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return drink.getPrice()*1.75;
	}
	
	

}
