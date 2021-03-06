package factory.simplefactory;

import factory.Pizza;
import factory.PizzaTypeEnum;

public class PizzaStore {
    public Pizza orderPizza(PizzaTypeEnum type) {
        Pizza pizza = SimplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
