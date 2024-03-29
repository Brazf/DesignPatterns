package designFactory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore ChicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+ pizza.getName()+"\n");
		
		pizza = ChicagoStore.orderPizza("Cheese");
		System.out.println("Joel ordered a "+ pizza.getName()+"\n");
		
	}
}
