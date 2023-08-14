package sample4;

import java.util.Scanner;

public class Array3Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;
        float avg = 0.0f;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        avg = sum/5;
        System.out.println("총합 = " + sum);
        System.out.println("평균 = " + avg);
    }
}
