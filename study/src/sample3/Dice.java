package sample3;

public class Dice {
    int num;
    public int roll(){
        double result = 1 + Math.random() * 6;
        return (int)result;
    }
}
