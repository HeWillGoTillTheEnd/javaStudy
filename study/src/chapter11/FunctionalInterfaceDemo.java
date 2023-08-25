package chapter11;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Predicate<String> isEmptyStr = s-> s.length() == 0;
        String s = "";

        if(isEmptyStr.test(s))
            System.out.println("This is an empty String.");

        IntPredicate isNotOrder = i -> i % 2 == 0;
        int i =4;
        if(isNotOrder.test(i))
            System.out.println("This is Not Order");

    }
}
