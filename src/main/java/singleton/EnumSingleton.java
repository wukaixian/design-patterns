package singleton;

/**
 * enum based singleton,
 */
public enum EnumSingleton {
    INSTANCE;
    private final Singleton singleton;

    EnumSingleton() {
        singleton = new Singleton();
    }

    public Singleton getSingleton() {
        return singleton;
    }
}
