package singleton;

public class TestDrive {
    public static void main(String[] args) {
        Singleton singleton = EnumSingleton.INSTANCE.getSingleton();
        singleton.hello();
    }
}
