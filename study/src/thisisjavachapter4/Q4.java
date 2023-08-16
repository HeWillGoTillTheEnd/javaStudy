package thisisjavachapter4;

public class Q4 {
    public static void main(String[] args) {
        while(true){
            int dice1 = (int) (Math.random() * 6) +1;
            int dice2 = (int) (Math.random() * 6) +1;
            System.out.println("dice1 = " + dice1);
            System.out.println("dice2 = " + dice2);
            if(dice1 + dice2 == 5) break;
        }
    }
}
