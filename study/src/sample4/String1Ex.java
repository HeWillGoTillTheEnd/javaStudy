package sample4;

public class String1Ex {
    public static void main(String[] args) {
        String s1 = new String("안녕, 자바");
        String s2 = new String("안녕, 자바");
        System.out.println(System.identityHashCode(s1) +" s1");
        System.out.println(System.identityHashCode(s2)+ " s2");
        s1 = s2;
        System.out.println(System.identityHashCode(s1) +" s1");
        System.out.println(System.identityHashCode(s2) + " s2");

        int i = s1.compareTo(s2);
        System.out.println(i);
    }
}
