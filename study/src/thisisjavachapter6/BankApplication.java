package thisisjavachapter6;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
    static ArrayList<Account> account = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.println("선택> ");
            String s = sc.nextLine();
            if(!s.equals("1") && !s.equals("2") && !s.equals("3")&& !s.equals("4")&& !s.equals("5")){
                System.out.println("잘못된 입력입니다 다시 입력해주세요");
                continue;
            }
            int command = Integer.parseInt(s);
            if(command ==1){
                createAccount(sc);
            }else if( command == 2){
                accountList();
            }else if (command == 3){
                deposit(sc);
            } else if(command == 4){
                withdraw(sc);
            } else if(command == 5){
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 입력입니다 다시 입력해 주세요.");
                continue;
            }
        }
    }

    private static void withdraw(Scanner sc) {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");
        System.out.println("계좌번호 :");
        String ac = sc.nextLine();
        System.out.println("출금액 :");
        int d = Integer.parseInt(sc.nextLine());
        for (Account account1 : account) {
            if (account1.getAccountNum().equals(ac)) {
                if(account1.getDeposit() > d){
                    account1.setDeposit(account1.getDeposit()-d);
                    System.out.println("결과: 출금이 성공되었습니다.");
                } else System.out.println("잔액이 부족합니다.");
            }
        }
    }

    private static void deposit(Scanner sc) {
        System.out.println("----------");
        System.out.println("예금");
        System.out.println("----------");
        System.out.println("계좌번호 :");
        String ac = sc.nextLine();
        System.out.println("예금액 :");
        int d = Integer.parseInt(sc.nextLine());
        for (Account account1 : account) {
            if (account1.getAccountNum().equals(ac)) {
                account1.setDeposit(account1.getDeposit()+d);
            }
        }
    }

    private static void accountList() {
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");
        for (Account account1 : account) {
            System.out.println(account1.getAccountNum() + " " + account1.getName() + " " + account1.getDeposit());
        }
    }

    private static void createAccount(Scanner sc) {
        System.out.println("계좌번호: ");
        String acnum = sc.nextLine();
        System.out.println("계좌주: ");
        String acname = sc.nextLine();
        System.out.println("초기입금액: ");
        int fd = Integer.parseInt(sc.nextLine());
        Account ac = new Account(acnum,acname,fd);
        account.add(ac);
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

}
