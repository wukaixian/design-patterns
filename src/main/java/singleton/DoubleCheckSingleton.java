package singleton;

public final class DoubleCheckSingleton {
    private volatile static Singleton instance;

    private DoubleCheckSingleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
