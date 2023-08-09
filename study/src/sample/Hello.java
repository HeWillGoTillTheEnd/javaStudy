package sample;

import java.util.Scanner;

/**
 *  Hello Sample Program
 *  main-method
 *  hello를 출력하는 프로그램
 */

public class Hello {

    public static void main(String[] args) {
//        final double PIE = 3.14159d;
//        String hello = "Hello!";
//        System.out.println(hello);
//        System.out.println(PIE);
//        byte b = (byte) 300; // 값 손실이 일어나서 44가 나타나게됨
//        System.out.println(b);
//
//        float f = (float) 3.14;
//        System.out.println(f);
//
//        char zero = '0';
//        char three = '3' - '0';
//        System.out.println((int)three);

        int i = 1;
        double d3 = 2.1214;

        String str3 = 3 + "";
        System.out.println(str3);
        System.out.printf("i = %d and d3 = %f\n",i,d3);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        sc.close();
    }
}
