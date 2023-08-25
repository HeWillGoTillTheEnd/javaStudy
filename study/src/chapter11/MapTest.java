package chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("김열공", 80);
        map.put("최고봉", 90);
        map.put("우등생", 95);
        map.put("나자바", 88);
        while(true){
            System.out.print("이름을 입력하세요 : ");
            String s = sc.nextLine();
            if(s.equals("끝")) break;
            Integer i = map.get(s);
            System.out.println(i);
        }
    }
}
