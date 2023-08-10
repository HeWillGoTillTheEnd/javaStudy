package sample2.classex;

public class AnimalTest {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.breath();
        bird.move();
        RealAnimal realAnimal = new RealAnimal();
        realAnimal.breath();
        realAnimal.move();
        realAnimal.eat();
        Fish fish = new Fish();
        fish.move();
        fish.eat();
        fish.breath();

    }
}
