package singleton;

public class SimpleSingleton {
    private SimpleSingleton() {
    }

    public static final Singleton INSTANCE = new Singleton();
}
