package problems2.p6;

public class Vehicle {
    String color;
    int speed;
    void show(){
        System.out.println("color = " + color);
        System.out.println("speed = " + speed);
    }

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
}
