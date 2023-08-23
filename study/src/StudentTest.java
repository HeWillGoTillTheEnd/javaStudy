public class StudentTest {
    public static void main(String[] args) {
        System.out.println(new Student("김삿갓"));
        System.out.println(new Student("홍길동"));
    }

    static class Student{
        String name;

        public Student(String name) {
            this.name = "학생["+name+"]";
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}
