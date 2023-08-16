package problems1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("URL을 입력하세요 : ");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("bye")) break;
            if (answer.toLowerCase().endsWith("com")) {
                System.out.println(answer+ "은 'com'으로 끝납니다.");
            }
            if(answer.toLowerCase().contains("java")) System.out.println(answer + "은 'java'를 포함합니다");
        }
    }
}
