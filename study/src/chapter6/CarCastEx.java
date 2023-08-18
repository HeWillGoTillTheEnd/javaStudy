package chapter6;

public class CarCastEx {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        c.move();
        c.whoAmI();
        v.move();
        v.whoAmI();


        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new SportsCar();
        for (Vehicle w : vehicles) {
            w.whoAmI();
        }
    }
}
