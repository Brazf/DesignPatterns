package bakeryTest;

/**
 * Create an order and print it
 */

public class Main {
    public static void main(String[] args) {
        Cake chocolateCake = new ChocolateCake();
        System.out.println(chocolateCake.cost() + " " + chocolateCake.getDescription());

        Cake vanillaCake = new VanillaCake();
        vanillaCake = new SayingCake(vanillaCake, "PLAIN!");
        System.out.println(vanillaCake.cost() + " " + vanillaCake.getDescription());

        Cake fancyVanillaCake = new VanillaCake();
        fancyVanillaCake = new SprinklesCake(fancyVanillaCake);
        fancyVanillaCake = new SayingCake(fancyVanillaCake, "FANCY");
        System.out.println(fancyVanillaCake.cost() + " " + fancyVanillaCake.getDescription());

        Cake strawberryCake = new StrawberryCake();
        strawberryCake = new MultiLayeredCake(strawberryCake);
        strawberryCake = new SprinklesCake(strawberryCake);
        strawberryCake = new SprinklesCake(strawberryCake);
        strawberryCake = new SayingCake(strawberryCake, "One of");
        strawberryCake = new SayingCake(strawberryCake, "EVERYTHING");
        System.out.println(strawberryCake.cost() + " " + strawberryCake.getDescription());
    }
}