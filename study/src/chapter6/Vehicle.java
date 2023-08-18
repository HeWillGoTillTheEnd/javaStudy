package chapter6;

public class Vehicle {
    String name = "탈 것";

    void whoAmI(){
        System.out.println("나는 탈 것 입니다");
    }
    void move(){
        System.out.println("이동불가");
    }

}

class Car extends Vehicle{
    String name = "자동차";

    @Override
    void whoAmI() {
        System.out.println("나는 자동차 입니다.");
    }

    @Override
    void move() {
        System.out.println("이동합니다");
    }
}

class SportsCar extends Car{
    void whoAmI(){
        System.out.println("나는 스포츠 자동차 입니다.");
    }
}
