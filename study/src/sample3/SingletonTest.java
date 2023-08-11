package sample3;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2);
        System.out.println(singleton);
    }
}
