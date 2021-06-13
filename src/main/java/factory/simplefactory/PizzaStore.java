package factory.simplefactory;

import java.text.SimpleDateFormat;

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
