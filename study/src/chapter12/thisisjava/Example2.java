package chapter12.thisisjava;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        double reduce = list.stream()
                .mapToDouble(Member::getAge)
                .reduce(0, Double::sum);
        double avg = reduce / list.size();
        System.out.println("평균 나이: " + avg);
    }
}
