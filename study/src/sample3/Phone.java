package sample3;

public class Phone {
    private static long numberOfPhones;

    String model;
    int value;
    void print() {
        System.out.println(value + "만원 짜리 " + model + " 스마트폰");
    }

//    public Phone() {
//    }

    public Phone(String model, int value) {
        this.model = model;
        this.value = value;
        numberOfPhones++;
    }

    public static long getNumberOfPhones() {
        return numberOfPhones;
    }
}
