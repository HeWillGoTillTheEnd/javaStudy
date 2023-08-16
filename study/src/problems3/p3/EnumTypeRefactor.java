package problems3.p3;

import java.util.Arrays;
import java.util.Scanner;

public class EnumTypeRefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        int[] scores = new int[numOfStudents];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("학생의 점수를 입력하세요");
            scores[i] = sc.nextInt();
        }
        RankType[] rank = new RankType[numOfStudents];
        int i = 0;
        for (int score : scores) {
            if (score > 90) {
                rank[i] = RankType.A;
                i++;
            } else if (score > 80) {
                rank[i] = RankType.B;
                i++;
            } else if (score > 70) {
                rank[i] = RankType.C;
                i++;
            } else if (score > 60) {
                rank[i] = RankType.D;
                i++;
            } else {
                rank[i] = RankType.F;
                i++;
            }
        }
        for (int j = 0; j < rank.length; j++) {
            System.out.println("현재 학생의 점수는 " + scores[j] + "이고 등급은 " + rank[j] + " 입니다.");

        }
    }
}
