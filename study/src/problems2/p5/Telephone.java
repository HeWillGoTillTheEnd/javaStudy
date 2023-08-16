package problems2.p5;

public class Telephone extends Phone{
    private String when;
    void autoAnswering(){
        System.out.println(super.owner+"가 부재중이니 "+ when+" 전화 요망드립니다.");
    }

    public Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }
}
