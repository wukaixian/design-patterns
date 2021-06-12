package decorator.pancake;

/**
 * 4、具体的装饰者-ConcreteDecorator
 */
public class Egg extends CondimentDecorator {
    protected Egg(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getDescription() {
        return pancake.getDescription() + "加蛋";
    }

    @Override
    public double cost() {
        return 1 + pancake.cost();
    }
}
