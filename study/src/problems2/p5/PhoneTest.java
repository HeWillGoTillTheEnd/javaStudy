package problems2.p5;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "내일", "갤러그")};
        for (Phone phone : phones) {
            if(phone instanceof Smartphone) ((Smartphone) phone).playGame();
            else if(phone instanceof Telephone) ((Telephone) phone).autoAnswering();
            else if(phone instanceof Phone) phone.talk();
        }
    }
}
