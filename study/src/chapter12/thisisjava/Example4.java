package chapter12.thisisjava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        List<Member3> list = Arrays.asList(
                new Member3("홍길동", "개발자"),
                new Member3("김나리", "디자이너"),
                new Member3("신용권", "개발자")
        );

        Map<String, List<Member3>> collect = list.stream().collect(Collectors.groupingBy(Member3::getJob));

        System.out.println("[개발자]");
        Iterator<Member3> dev = collect.get("개발자").iterator();
        collect.get("개발자").forEach(a-> System.out.println(a.toString()));

        System.out.println("[디자이너]");
        collect.get("디자이너").forEach(a-> System.out.println(a.toString()));
    }
}
