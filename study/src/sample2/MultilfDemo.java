package sample2;

import java.util.Scanner;

public class MultilfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade;
        System.out.println("점수를 입력하세요 : ");
        int score = sc.nextInt();
        if(score >= 90 && score <= 100){
            grade = "A";
        } else if (score >= 80){
            grade = "B";
        }else if (score >= 70){
            grade = "C";
        }else if (score >= 60){
            grade = "D";
        } else grade = "F";
        if(score >= 60) {
            if(score % 10 >= 5)  grade += "+";
        }
        System.out.println("당신의 학점은 " + grade);
    }
}
