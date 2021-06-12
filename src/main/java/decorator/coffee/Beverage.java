package decorator.coffee;

/**
 * 饮料
 */
public abstract class Beverage {

    String description = "UnKnown";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
