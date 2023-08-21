package problems4.q3;

import java.util.Arrays;

public class PersonEx {

    public static void main(String[] args) {
        Person p1 = new Person(20, 20, 20);
        Person p2 = new Person(30, 30, 30);
        Person p3 = new Person(40, 40, 40);


        Person[] people = new Person[3];

        people[0] = p3;
        people[1] = p2;
        people[2] = p1;
        Person[] peopleReverse = new Person[3];

        peopleReverse[0] = p1;
        peopleReverse[1] = p2;
        peopleReverse[2] = p3;

        System.out.println("People 일반 정렬 전 :");
        for (Person person : peopleReverse) {
            System.out.print(person.getWeight()+ " ");
        }
        Arrays.sort(peopleReverse);
        System.out.println("People 일반 정렬 후 :");
        for (Person person : peopleReverse) {
            System.out.print(person.getWeight() + " ");
        }


        Arrays.sort(peopleReverse);
    }

    static class Person implements Comparable<Person>{
        int age;
        int weight;
        int height;


        public Person(int age, int weight, int height)  {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        public int getHeight() {
            return height;
        }


        @Override
        public int compareTo(Person o) {
            return o.weight -  this.weight;
        }

    }
}
