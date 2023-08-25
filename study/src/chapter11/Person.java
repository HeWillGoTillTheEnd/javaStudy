package chapter11;

import java.util.Objects;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return this.name + " : " + this.age;
    }

    @Override
    public int hashCode() {

        int hash = Objects.hash(age);
        System.out.println(hash);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return p.age == this.age;
    }
}
