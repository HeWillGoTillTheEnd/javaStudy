package sample3;

public class DiceEx {
    public static void main(String[] args) {
        Dice d = new Dice();
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;

        for(int i =0; i<1000000000;i++){
            int roll = d.roll();
            if(roll == 0) {
                System.out.println("0이 나왔음!!!");
                break;
            }
            if(roll == 1) one++;
            if(roll == 2) two++;
            if(roll == 3) three++;
            if(roll == 4) four++;
            if(roll == 5) five++;
            if(roll == 6) six++;
            if(roll == 7) {
                System.out.println("7이나왔음!!!");
                break;
            }
        }
        System.out.println("one = " + one);
        System.out.println("two = " + two);
        System.out.println("three = " + three);
        System.out.println("four = " + four);
        System.out.println("five = " + five);
        System.out.println("six = " + six);
    }
}
