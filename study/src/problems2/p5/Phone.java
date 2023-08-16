package problems2.p5;

public class Phone {

    protected String owner;
    void talk(){
        System.out.println(owner + "가 현재 통화중 입니다.");
    }

    public Phone(String owner) {
        this.owner = owner;
    }
}
