package designTemplate;

public abstract class CaffeineBeverage {

	void prepareRecipe() {
		boilWater();
		pourInCup();
		brew();
		addCondiments();
	}
	
	abstract void addCondiments();
	
	abstract void brew();
	
	void boilWater()	{
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
}
