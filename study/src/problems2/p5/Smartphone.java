package problems2.p5;

public class Smartphone extends Telephone {
    private String game;
    void playGame(){
        System.out.println(super.owner+"가 현재 "+ game+"중 입니다.");
    }

    public Smartphone(String owner, String when, String game) {
        super(owner, when);
        this.game = game;
    }
}
