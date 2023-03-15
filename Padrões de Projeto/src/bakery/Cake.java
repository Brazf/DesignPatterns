package bakery;

/**
 * Cake bake class.
 */
public abstract class Cake {
    private static int CAKE_COST = 10;

    public int getCost() {
        return CAKE_COST;
    }

    public abstract String getDescription();
    
    
}
