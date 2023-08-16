package chapter05;

public class FiveMax {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 1};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) max = numbers[i];
        }
        System.out.println(max);
    }
}
