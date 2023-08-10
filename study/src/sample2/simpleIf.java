package sample2;

import java.util.Scanner;

public class simpleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        if(num % 2 ==0){
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
