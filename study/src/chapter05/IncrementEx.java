package chapter05;

import java.util.Scanner;

public class IncrementEx {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[1]);
        for (int i = 0; i < num; i++) {
            System.out.println(args[0]);
        }

    }
    public static void increment(int[] n) {
        System.out.print("increment() 메서드 안에서 ");
        System.out.print("n[0] = " + n[0] + " ---> ");
        n[0]++;
        System.out.println("n[0] = " + n[0]);
    }
}
