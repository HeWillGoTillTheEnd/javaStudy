package sample2.classex;

public class Animal {

    void breath(){
        System.out.println("후 후");
    }
    void eat() {
        System.out.println("쿰척 쿰척");
    }
    void move(){
        System.out.println("뚜벅 뚜벅");
    }

}
class Bird extends Animal{
    void breath(){
        System.out.println("힉 힉");
    }
    void eat() {
        System.out.println("콕콕");
    }
    void move(){
        System.out.println("따박따박");
    }
}

class Fish extends Animal{
    void breath(){
        System.out.println("뻐끔뻐끔");
    }
    void eat() {
        System.out.println("쩝쩝");
    }
}
class RealAnimal extends Animal {

}
