package factory.factorymethod;

import factory.Pizza;
import factory.PizzaTypeEnum;

public abstract class PizzaStore {
    public Pizza orderPizza(PizzaTypeEnum type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();

        return pizza;
    }

    abstract Pizza createPizza(PizzaTypeEnum type);
}
