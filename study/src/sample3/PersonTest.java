package sample3;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("성수");
        p.setAge(21);
        p.sayHello();

        Person p2 = new Person();
        p2.setName("용웅").setAge(31).sayHello();
    }
}
