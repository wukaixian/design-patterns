package decorator.pancake;

public class PancakeTest {
    public static void main(String[] args) {
        Pancake pancake = new BetterPancake();
        display(pancake);

        Pancake pancake1=new BetterPancake();
        pancake1=new Egg(pancake1);
        display(pancake1);

        pancake1=new Sausage(pancake1);
        display(pancake1);

        pancake1=new Youtiao(pancake1);
        display(pancake1);
    }

    static void display(Pancake pancake) {
        System.out.println(pancake.getDescription() + " $" + pancake.cost());
    }
}
