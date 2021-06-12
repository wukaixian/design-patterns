package decorator.pancake;

/**
 * 3、抽象装饰器-Decorator
 */
public abstract class CondimentDecorator extends Pancake {
    protected final Pancake pancake;

    protected CondimentDecorator(Pancake pancake) {
        this.pancake = pancake;
    }

    public abstract String getDescription();
}
