package bakeryTest;

public class MultiLayeredCake extends CakeDecorator {
    Cake cake;

    public MultiLayeredCake(Cake cake) {
        this.cake = cake;
    }

    public String getDescription() {
        return "Multi-layered " + cake.getDescription();
    }

    public double cost() {
        return 5.0 + cake.cost();
    }
}