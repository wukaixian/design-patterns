package decorator.coffee;

public class Whip extends Beverage {
    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip Coffee";
    }

    @Override
    public double cost() {
        return 2.0 + beverage.cost();
    }
}
