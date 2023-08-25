package chapter11;

public class StudentEx {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };
    //avg() 메소드 작성
    public static double avg(Fuction<Student> function){
        int sum =0;
        for (Student student : students) {
            sum += function.apply(student);
        }
        double avg = (double) sum / students.length;
        return avg;
    }
    public static void main(String[] args) {
        double englishAvg = avg( s -> s.getEnglishScore() );
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg( s -> s.getMathScore() );
        System.out.println("수학 평균 점수: " + mathAvg);
    }
}
