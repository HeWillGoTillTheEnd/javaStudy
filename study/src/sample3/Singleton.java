package sample3;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    static Singleton getSingleton(){
        return singleton;
    }
}
