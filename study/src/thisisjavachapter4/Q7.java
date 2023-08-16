package thisisjavachapter4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int account = 0;
        while(true){
            System.out.println("----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고| 4.종료");
            System.out.println("----------------------------");
            String s = sc.nextLine();
            System.out.println("선택 > " + s);
            if(Integer.parseInt(s) == 1){
                String s1 = sc.nextLine();
                account = Integer.parseInt(s1) + account;
                System.out.println("예금액> "+ s1);
            }
            if(Integer.parseInt(s) == 2){
                String s1 = sc.nextLine();
                account -=Integer.parseInt(s1);
                System.out.println("출금액> "+ s1);
            }
            if(Integer.parseInt(s) == 3){
                System.out.println("잔고>" + account);
            }
            if(Integer.parseInt(s) == 4){
                System.out.println("프로그램 종료");
                break;
            }


        }
    }
}
