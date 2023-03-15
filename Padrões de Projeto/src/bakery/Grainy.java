package bakery;

public class Grainy extends MultiLayered{

	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return cake.getDescription()+" with sprinkles";
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return super.getCost()+2;
	}

}
