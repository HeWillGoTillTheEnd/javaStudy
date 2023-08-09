package sample;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println(i);
        sc.close();

        int a = 1000000;
        long b = 2000000l; //int 로 계산할 경우 인트에서 계산이 된 후 형
        // 변환이 일어나기 때문에 정상적으로 값이 저장되지 않는다


        long c = a * b;
        System.out.println(c);

        double result = 5/0.0;
        double resul1t = 5%0.0;

        boolean infinite = Double.isInfinite(result);
        boolean naN = Double.isNaN(resul1t);
        System.out.println("naN = " + naN);
        System.out.println("infinite = " + infinite);

        System.out.println("resul1t = " + (resul1t+2));
        System.out.println("result = " + (result+3));
    }
}
