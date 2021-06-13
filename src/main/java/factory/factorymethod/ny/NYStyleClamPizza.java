package factory.factorymethod.ny;

import factory.Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        super("NYStyleClamPizza");
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
