package decorator.pancake;

/**
 * 2、具体的组件-ConcreteComponent
 */
public class BetterPancake extends Pancake {
    public BetterPancake() {
        description="煎饼果子";
    }

    @Override
    public double cost() {
        return 5;
    }
}
