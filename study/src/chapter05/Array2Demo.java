package chapter05;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        int sum =0;
        int inputScore = 0;
        float avg = 0.0f;
        while(true){
            System.out.println("학생의 점수를 입력하시오 만약 종료하려면 -1을 입력하시오 :");
            inputScore = sc.nextInt();
            if(inputScore <0) break;
            scores.add(inputScore);
        }
        for (Integer score : scores) {
            sum += score;
        }
        avg = (float) sum / scores.size();
        System.out.println("학생들 점수의 총합은 :  " + sum);
        System.out.println("학생들 점수의 평균은 :  " + avg);

    }
}
