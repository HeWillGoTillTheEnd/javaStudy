package sample2;

import java.util.Scanner;

public class Switch4Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        switch (day) {
            case "MONDAY","FRIDAY","SUNDAY" -> System.out.println(6);
            case "TUESDAY" -> System.out.println(7);
            case "THURSDAY","SATURDAY" -> System.out.println(8);
            case "WEDNESDAY" -> System.out.println(9);

        }
    }
}
