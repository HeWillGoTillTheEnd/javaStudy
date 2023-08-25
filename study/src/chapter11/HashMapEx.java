package chapter11;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>(Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion"));
        map.replaceAll((k,v) -> v.toUpperCase());
        map.forEach((k,v) -> System.out.println(k + " : " + v));

    }
}
