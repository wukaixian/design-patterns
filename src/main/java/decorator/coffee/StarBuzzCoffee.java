package decorator.coffee;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast(beverage);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription()+" $" +beverage2.cost());

        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $" +beverage2.cost());

        Beverage beverage3=new HouseBlend();
        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());

        beverage3=new Mocha(beverage3);
        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
        beverage3=new Whip(beverage3);
        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
    }
}
