package problems2.p6;

public class Car extends Vehicle{
    int displacement;//자동차 배기량
    int gears;//자동차 단수

    void show(){
        System.out.println("displacement = " + displacement);
        System.out.println("gears = " + gears);
        System.out.println("color = " + color);
        System.out.println("speed = " + speed);
    }

    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }
}
