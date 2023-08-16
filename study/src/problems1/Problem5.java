package problems1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[10];
        for(int i=0; i<10;i++){
            int s = sc.nextInt();
            if(s>=0 && s<=100) number[s/10]++;
        }
        for (int i = 0; i < 10; i++) {
            if(i == 0) System.out.println("0~9:"+"*".repeat(number[i]));
            else System.out.println(i+"0~"+i+"9:"+"*".repeat(number[i]));
        }
    }
}
