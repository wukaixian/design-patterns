package factory.simplefactory;

public class SimpleFactoryTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(PizzaTypeEnum.CHEESE);

        pizzaStore.orderPizza(PizzaTypeEnum.VEGGIE);
    }
}
