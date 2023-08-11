package sample3;

public class Person {

    private String name;
    private int age;
    public void sayHello() {
        System.out.println("안녕 나는" + name + "고 나이는 "+ age+ "살이야 ");
    }

    public Person setName(String name) {

        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setAge(int i) {
        this.age = i;
        return this;
    }
}
