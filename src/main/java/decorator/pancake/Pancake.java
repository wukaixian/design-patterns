package decorator.pancake;

/**
 * 1、定义抽象组件-Component
 */
public abstract class Pancake {
    String description = "普通煎饼";

    public String getDescription() {
        return description;
    }

    /**
     * 价格
     */
    public abstract double cost();
}
