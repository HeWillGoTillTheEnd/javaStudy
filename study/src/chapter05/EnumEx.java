package chapter05;

public class EnumEx {
    public static void main(String[] args) {
        People people = new People(20,Gender.MALE,Direction.SOUTH);
        Gender male = Gender.MALE;
        if(male == Gender.MALE) System.out.println("남성입니다.");
        Gender female = Gender.FEMALE;
        if(female == Gender.FEMALE) System.out.println(Gender.MALE + "은 병역 의무가 있다.");
        else System.out.println(Gender.FEMALE+ "은 병역 의무가 없다.");

//        if(female == Direction.SOUTH)
//            System.out.println(Direction.SOUTH + "은 누구?");

        for (Gender value : Gender.values()) {
            System.out.println(value.name());
        }
    }

}

class People{
    private int age = 0;
    private final Gender gender;
    private Direction direction;

    public People(int age, Gender gender, Direction direction) {
        this.age = age;
        this.gender = gender;
        this.direction = direction;
    }

    public People(int age, Gender gender) {
        this.age = age;
        this.gender = gender;
    }

}
