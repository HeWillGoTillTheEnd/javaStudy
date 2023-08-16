package sample4;

import sample3.Circle2;

public class ArrayClassEx {
    public static void main(String[] args) {
        Circle2[] circle2s = new Circle2[5];
        int radius = 0;
        for (int i = 0; i < 5; i++) {
            Circle2 circle2 = new Circle2(i + 1, "빨강");
            circle2s[i] = circle2;

            System.out.println(("원의 넓이 : ")+(3.14 * circle2.getRadius() * circle2.getRadius()));
        }
    }
    public static void zero(Circle2 c){
        c.setRadius(0.0);
    }
    public static void zero(double r){
        r = 0.0;
    }
}
