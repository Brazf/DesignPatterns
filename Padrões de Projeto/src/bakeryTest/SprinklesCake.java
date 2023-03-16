package bakeryTest;


public class SprinklesCake extends CakeDecorator {
    Cake cake;

    public SprinklesCake(Cake cake) {
        this.cake = cake;
    }

    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }

    public double cost() {
        return 2.0 + cake.cost();
    }
}