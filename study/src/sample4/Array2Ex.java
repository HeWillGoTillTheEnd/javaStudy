package sample4;

import java.util.Arrays;

public class Array2Ex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(arr);
        String string = Arrays.toString(arr);
        System.out.println(string);
        String sample = "ABC";
        char[] cArr = sample.toCharArray();
        System.out.println(cArr); //문자의 배열-> 문자열 -> String임
        String string1 = Arrays.toString(cArr);
        System.out.println(string1);

    }
}
