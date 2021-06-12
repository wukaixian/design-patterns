package decorator.coffee;

public class Soy extends Beverage {
    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy Coffee";
    }

    @Override
    public double cost() {
        return 1.0 + beverage.cost();
    }
}
