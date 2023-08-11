package sample3;

public class OneToTenDemo {
    static int sumOneToTen;
    static {
        int sum =0;
        for(int i =0;i <= 10; i++)
            sum += i;
        sumOneToTen = sum;
    }
    int sumOneToTen2;
    {
        int sum =0;
        for(int i =0; i<= 10; i++)
        sum += i;
        sumOneToTen2 = sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOneToTen);
    }
}
