package sample4;

import sample3.Circle;

public class CallByRef {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(10);

        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            Circle c = new Circle(i+1);
            System.out.println("넓이 : " + c.findArea());
            change(c);
            System.out.println("넓이 : " + c.findArea());
        }
    }
    public static void zero(Circle c){
        c.setRadius(0.0);
    }
    public static void zero(double r){
        r = 0.0;
    }
    public static void change(Circle c){
        double radius = c.getRadius();
        c.setRadius(++radius);
    }

}
