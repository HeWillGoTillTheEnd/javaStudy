package chapter12;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Reduce1Demo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 4, 5, 1, 2);
        Integer sum1 = numbers.stream().reduce(0, Integer::sum);
        Integer sum2 = numbers.stream().reduce(0, Integer::sum);
        Integer mul = numbers.stream().reduce(1, (a, b) -> a * b);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(mul);

        Optional<Integer> sum3 = numbers.stream().reduce(Integer::sum);
        OptionalInt sum4 = numbers.stream().mapToInt(Integer::intValue).reduce(Integer::sum);
        Optional<Integer> mul2 = numbers.stream().reduce(Reduce1Demo::kop);

        System.out.println(sum3.get());
        System.out.println(sum4.getAsInt());
        mul2.ifPresent(Util::print);
    }

    static int kop(int a, int b){
        return a * b;
    }
}
