package factory.factorymethod;

import factory.PizzaTypeEnum;

public class TestDrive {
    public static void main(String[] args) {
        PizzaStore store = new NYStylePizzaStore();
        store.orderPizza(PizzaTypeEnum.CHEESE);

        System.out.println();
        store = new LAStylePizzaStore();
        store.orderPizza(PizzaTypeEnum.VEGGIE);
    }
}
