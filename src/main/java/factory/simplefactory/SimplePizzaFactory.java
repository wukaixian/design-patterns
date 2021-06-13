package factory.simplefactory;

import java.security.NoSuchProviderException;

public class SimplePizzaFactory {
    public static Pizza createPizza(PizzaTypeEnum type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            default:
                throw new RuntimeException("not support type");
        }
        return pizza;
    }
}
