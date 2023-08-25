package chapter09;

public class DiceTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(new Dice().roll());
    }
    static class Dice{
        int noon;

        String roll(){
            return "숫자는!" + noon;
        }
        public Dice() throws InterruptedException {
            this.noon = (int) (Math.random() * 6) +1;
        }
    }
}
