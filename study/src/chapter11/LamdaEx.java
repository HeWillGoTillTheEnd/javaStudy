package chapter11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LamdaEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
        list.sort(String::compareTo);
        System.out.println(list);
    }

}
