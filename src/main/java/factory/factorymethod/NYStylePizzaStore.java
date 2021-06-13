package factory.factorymethod;

import factory.Pizza;
import factory.PizzaTypeEnum;
import factory.factorymethod.ny.NYStypeCheesePizza;
import factory.factorymethod.ny.NYStyleClamPizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaTypeEnum type) {
        switch (type) {
            case CLAM:
                return new NYStyleClamPizza();
            case CHEESE:
                return new NYStypeCheesePizza();
            default:
                throw new RuntimeException("not supports");
        }
    }
}
