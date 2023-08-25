package chapter11;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterface3Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(System.out::println);
    }
}
