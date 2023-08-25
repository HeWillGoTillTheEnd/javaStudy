package chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; //최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; //최고 점수를 저장하는 변수
        int totalScore = 0; //점수 합계를 저장하는 변수

        //여기에 코드를 작성하세요.
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            if(next.getValue() > maxScore) {
                maxScore = next.getValue();
                name = next.getKey();
            }
            totalScore += next.getValue();
        }
        System.out.println(name);
        System.out.println(maxScore);
        System.out.println(totalScore/entries.size());
    }
}
