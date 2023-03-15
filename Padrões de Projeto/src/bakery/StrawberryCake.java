package bakery;

public class StrawberryCake extends Cake{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Strawberry Cake";
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return super.getCost()*2;
	}
	

}
