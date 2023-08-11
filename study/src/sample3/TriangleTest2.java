package sample3;

public class TriangleTest2 {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2(10.0,5.0);
        Triangle2 t2 = new Triangle2(5.0,10.0);
        Triangle2 t3 = new Triangle2(8.0,8.0);
        System.out.println(t1.isSameArea(t2));
        System.out.println(t2.isSameArea(t3));

    }
}
