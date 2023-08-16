package problems2.p3;

public class ForeignStudent extends Student{
    private String nationality;

    public ForeignStudent(String name, int age, int studentId, String nationality) {
        super(name, age, studentId);
        this.nationality = nationality;
    }

    public void show(){
        System.out.println("사람[이름 : "+ this.getName() +", 나이 : "+ this.getAge() + ", 학번 : " + this.getStudentId()+ ", 국적 : " + nationality + "]");
    }
}
