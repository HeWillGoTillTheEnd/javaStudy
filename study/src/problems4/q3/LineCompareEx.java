package problems4.q3;

import java.util.Arrays;
import java.util.Comparator;

public class LineCompareEx {
    public static void main(String[] args) {
        Line l1 = new Line(30);
        Line l2 = new Line(20);
        Line l3 = new Line(10);

        Line[] lines = new Line[3];
        lines[0] = l1;
        lines[1] = l2;
        lines[2] = l3;

        System.out.println("정렬 전");
        for (Line line : lines) {
            System.out.print(line.toString()+ " ");
        }

        Arrays.sort(lines);
        System.out.println("정렬 후");
        for (Line line : lines) {
            System.out.println(line.toString()+ " ");
        }


    }

    static class Line implements Comparator<Line>, Comparable<Line> {
        int length;

        public Line(int length) {
            this.length = length;
        }

        public int getLength() {
            return length;
        }

        @Override
        public String toString() {
            return String.valueOf(this.getLength());
        }

        @Override
        public int compare(Line o1, Line o2) {
            return o1.getLength() - o2.getLength();
        }

        @Override
        public int compareTo(Line o) {
            return this.getLength() - o.getLength();
        }
    }
}
