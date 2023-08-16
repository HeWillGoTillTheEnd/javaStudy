package problems3.p2;

import java.util.Arrays;
import java.util.Scanner;

public class Rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        int[] scores = new int[numOfStudents];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("학생의 점수를 입력하세요");
            scores[i] = sc.nextInt();
        }
        String[] rank = new String[numOfStudents];
        int i = 0;
        for (int score : scores) {
            if (score > 90) {
                rank[i] = "A";
                i++;
            } else if (score > 80) {
                rank[i] = "B";
                i++;
            } else if (score > 70) {
                rank[i] = "C";
                i++;
            } else if (score > 60) {
                rank[i] = "D";
                i++;
            } else {
                rank[i] = "F";
                i++;
            }
        }
        System.out.println(Arrays.toString(rank));
    }
}
