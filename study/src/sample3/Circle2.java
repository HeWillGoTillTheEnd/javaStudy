package sample3;

public class Circle2 {
    private static long numberOfCircles;

    private static long numberOfRedCircles;

    private double radius;
    private String color;

    public Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
        if(color.equals("빨강")) numberOfRedCircles++;
        numberOfCircles++;
    }

    public void countCircle(){
        System.out.println("원의 개수는 " + numberOfCircles + "개 이고, 빨간 원의 개수는" + numberOfRedCircles + "개 입니다.");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
