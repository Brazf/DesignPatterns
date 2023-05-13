package decoratorUdemmy;

public class Client {

	public static void pedido (String name, Drink drink) {
		System.out.println("Tipo de Bedida: " + name);
		drink.server();
		System.out.printf("Valor: $ %.2f", drink.getPrice());
		System.out.println("\n____________________________");
	}
	
	public static void main(String[] args) {
		
		pedido("Chá", new Tea());
		pedido("Café com leite", new Milk(new Expresso()));
		pedido("Double Expresso", new DoubleDrink(new Expresso()));
	}
}
