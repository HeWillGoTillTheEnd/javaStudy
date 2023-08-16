package problems2.p3;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
        String result = "사람[이름 : " + name + ", 나이 : " + age +"]";
        System.out.println(result);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
