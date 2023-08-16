package problems3.p1;

import java.util.Arrays;
import java.util.Scanner;

public class EnumScoreTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        int[] scores = new int[numOfStudents];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("학생의 점수를 입력하세요");
            scores[i] = sc.nextInt();
        }
        String string = Arrays.toString(scores);
        System.out.println(string);
    }
}
