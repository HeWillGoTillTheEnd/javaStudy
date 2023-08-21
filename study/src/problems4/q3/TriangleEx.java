package problems4.q3;

import java.util.Arrays;

public class TriangleEx {
    public static class Triangle implements Comparable<Triangle>{
        int area;

        public Triangle(int area) {
            this.area = area;
        }

        public int getArea() {
            return area;
        }

        @Override
        public int compareTo(Triangle o) {
            return this.getArea() - o.getArea();
        }

    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(100);
        Triangle triangle2 = new Triangle(200);
        Triangle triangle3 = new Triangle(300);

        Triangle[] t = new Triangle[3];
        t[0] = triangle3;
        t[1] = triangle2;
        t[2] = triangle1;

        Arrays.sort(t);

        for (Triangle triangle : t) {
            System.out.print(triangle.getArea() + " ");
        }
    }

}
