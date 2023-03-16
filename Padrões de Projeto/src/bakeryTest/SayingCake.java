package bakeryTest;

public class SayingCake extends CakeDecorator {
    Cake cake;
    String saying;

    public SayingCake(Cake cake, String saying) {
        this.cake = cake;
        this.saying = saying;
    }

    public String getDescription() {
        return cake.getDescription() + " with saying \"" + saying + "\"";
    }

    public double cost() {
        return cake.cost();
    }
}