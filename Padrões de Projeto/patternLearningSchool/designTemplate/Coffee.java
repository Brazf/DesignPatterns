package designTemplate;

public class Coffee extends CaffeineBeverage{

	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	public void addSugarAndMilk ()	{
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");
	}

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}


}
