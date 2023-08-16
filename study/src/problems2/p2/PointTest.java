package problems2.p2;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(10, 15);
        System.out.println(p.toString());
        MovablePoint mp = new MovablePoint(10, 15, 20, 25);
        System.out.println(mp.toString());

    }
}
