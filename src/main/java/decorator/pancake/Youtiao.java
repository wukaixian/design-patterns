package decorator.pancake;

/**
 * 4、具体的装饰者-加油条
 */
public class Youtiao extends CondimentDecorator {
    protected Youtiao(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getDescription() {
        return pancake.getDescription() + "加油条";
    }

    @Override
    public double cost() {
        return 1 + pancake.cost();
    }
}
