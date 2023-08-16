package problems2.p2;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        String result = "좌표 x :" + x + "좌표 y : " + y;
        return result;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
