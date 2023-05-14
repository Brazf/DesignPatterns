package designpatterns;

public class BoloMorango extends Cake{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return " Strawberry cake ";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return super.getCost()*2;
	}
	
}
