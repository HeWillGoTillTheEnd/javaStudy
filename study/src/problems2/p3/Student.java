package problems2.p3;

public class Student extends Person{
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void show(){
        System.out.println("사람[이름 : "+ this.getName() +", 나이 : "+ this.getAge() + ", 학번 : " + studentId + "]");
    }

    public int getStudentId() {
        return studentId;
    }
}
