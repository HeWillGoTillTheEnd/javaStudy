package chapter09;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 931010);
        Person p2 = new Person("황철순", 931010);
        if(p1.equals(p2)){
            System.out.println("c1과 c2는 같다");
        }else System.out.println("c1과 c2는 다르다");
    }
    static class Person{
        String name;
        int personNumber;


        public Person(String name, int personNumber) {
            this.name = name;
            this.personNumber = personNumber;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Person person){
                if(this.personNumber == ((Person) obj).personNumber) return true;
            }
            return false;
        }
    }
}
