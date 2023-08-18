package chapter6;

import problems2.p3.Person;
import problems2.p3.Student;

import java.util.ArrayList;

public class TypeDownCastingEx {
    public static void main(String[] args) {
        Student s = new Student("q", 12, 2);
        Person p = new Person("we", 123);

        System.out.println("(p instanceof Student) = " + (p instanceof Student));
        System.out.println("(s instanceof Person) = " + (s instanceof Person));
        System.out.println("(s instanceof Object) = " + (s instanceof Object));
    }
}
