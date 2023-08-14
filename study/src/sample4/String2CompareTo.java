package sample4;

public class String2CompareTo {
    public static void main(String[] args) {
        String s1 = "HI, JAVA";
        String s2 = "Hi, java";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
    }
}
