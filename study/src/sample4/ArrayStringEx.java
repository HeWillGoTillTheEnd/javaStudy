package sample4;

public class ArrayStringEx {
    public static void main(String[] args) {
        String[] names = new String[3];
        for (String name : names) {
            System.out.println(name);
        }
        names[0] = "kim";
        names[0] = "lee";
        names[0] = "park";
        for (String name : names) {
            System.out.println(name);
        }

    }
}
