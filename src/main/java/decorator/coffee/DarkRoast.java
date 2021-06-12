package decorator.coffee;

public class DarkRoast extends CondimentDecorator {
    private final Beverage beverage;

    public DarkRoast(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " DarkRoast Coffee";
    }

    @Override
    public double cost() {
        return 2.0 + beverage.cost();
    }
}
