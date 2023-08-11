package sample3;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("갤럭시 S8",100);

        myPhone.print();

        Phone yourPhone = new Phone("G6", 85);
        yourPhone.print();

        long numberOfPhones = Phone.getNumberOfPhones();
        System.out.println(numberOfPhones);

    }
}
