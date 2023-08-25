package chapter11;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "조민우"));

        System.out.println("저장된 객체 수: " + set.size());
        for (Student s : set) {
            System.out.println(s.studentNum + ":" + s.name);
        }
    }

    static class Student {
        public int studentNum;
        public String name;

        public Student(int studentNum, String name) {
            this.studentNum = studentNum;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentNum);
        }

        @Override
        public boolean equals(Object obj) {
            Student s = (Student) obj;
            return this.studentNum == s.studentNum;
        }
        //여기에 코드를 작성하세요.
    }
}
