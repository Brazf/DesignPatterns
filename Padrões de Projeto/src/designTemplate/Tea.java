package designTemplate;

public class Tea extends CaffeineBeverage{
	
	public void boilWater()	{
		System.out.println("Boiling water");
	}
	
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding Lemon");
	}

	@Override
	void brew() {
		System.out.println("steeping the Tea");
	}
}
