package decorator.pancake;

/**
 * 4、具体的装饰者
 */
public class Sausage extends CondimentDecorator {

    protected Sausage(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getDescription() {
        return pancake.getDescription() + "加肠";
    }

    @Override
    public double cost() {
        return 2 + pancake.cost();
    }
}
