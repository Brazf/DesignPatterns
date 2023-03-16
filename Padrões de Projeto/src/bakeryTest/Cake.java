package bakeryTest;

/**
 * Cake bake class.
 */

public abstract class Cake {
    
	String description = "Unknown cake";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
    
}