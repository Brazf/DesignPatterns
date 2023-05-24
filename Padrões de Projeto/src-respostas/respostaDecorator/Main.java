package respostaDecorator;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
      
    	// Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(new BoloFalante(new VanillaCake(), "PLAIN!"));
        order.addCake(new BoloFalante(new BoloGranulado(new VanillaCake()), "FANCY!"));
        order.addCake(new BoloFalante(new BoloFalante(new BoloVariasCamandas(new BoloGranulado(new BoloGranulado(new BoloMorango()))), "One of"), "EVERYTHING"));
        // Print the order
        order.printOrder();
    }
}