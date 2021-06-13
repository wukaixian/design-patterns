package factory.simplefactory;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        super("Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println(getName() + " prepare");
    }

    @Override
    public void bake() {
        System.out.println(getName() + " bake");
    }

    @Override
    public void cut() {
        System.out.println(getName() + " cut");
    }

    @Override
    public void box() {
        System.out.println(getName() + " box");
    }
}
