package chapter12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect1Demo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream();
        Double avg = sn.collect(Collectors.averagingDouble(Nation::getPopulation));
        System.out.println("인구 평균 : " + avg);

        sn = Nation.nations.stream();
        Long num = sn.collect(Collectors.counting());
        System.out.println("나라 개수 : " + num);

        sn = Nation.nations.stream();
        String name1 = sn.limit(4)
                .map(Nation::getName)
                .collect(Collectors.joining("-"));
        System.out.println("4개 나라(방법 1 : " + name1);

        sn = Nation.nations.stream();
        String name2 = sn.limit(4)
                .collect(Collectors.mapping(Nation::getName, Collectors.joining("+")));
        System.out.println("4개의 나라(방법 2) : " + name2);



    }
}
