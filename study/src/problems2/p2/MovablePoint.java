package problems2.p2;

public class MovablePoint extends Point {

    private int xSpeed, ySpeed;
    public String toString(){
        String result = "좌표 x :" + this.getX() + "좌표 y : " + this.getY()
                + " x축 이동속도 : " + xSpeed + " y축 이동속도 :" + ySpeed;
        return result;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }
}
