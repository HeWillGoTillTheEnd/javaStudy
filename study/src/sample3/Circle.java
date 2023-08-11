package sample3;

public class Circle {
    double radius;
    String color;
    double findArea(){
        return 3.14 * radius * radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(String color) {
        this.color = color;
    }

    void show(double x, double y){
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n",x,y);
    }
    public void setRadius(double radius){
        if(radius <= 0.0){
            System.out.println("몸의 반지름은 0보다 커야합니다");
        } else if( radius >= 0.1){
            this.radius = radius;
        }
    }
}
