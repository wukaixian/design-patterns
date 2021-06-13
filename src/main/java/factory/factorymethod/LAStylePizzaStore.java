package factory.factorymethod;

import factory.Pizza;
import factory.PizzaTypeEnum;
import factory.factorymethod.la.LAStyleVeggiePizza;
import factory.factorymethod.la.LAStypeCheesePizza;

public class LAStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaTypeEnum type) {
        switch (type) {
            case CHEESE:
                return new LAStypeCheesePizza();
            case VEGGIE:
                return new LAStyleVeggiePizza();
            default:
                throw new RuntimeException("not support");
        }
    }
}
