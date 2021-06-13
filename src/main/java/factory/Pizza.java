package factory;

public abstract class Pizza {
    private final String name;

    protected Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
