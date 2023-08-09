package sample;

public class OperatorEx {
    public static void main(String[] args) {
        Integer i = 0;
        int j =1;
        System.out.printf("j = %d and j = %d ",i,j = ++i);
        System.out.println(i);
        //++i는 참조되기 전에 더해라
        //i++는 참조를 먼저 한 다음에 더해
        int l =0;
        int m =l++;
        System.out.printf("l = %d and m = %d ",l,m);


    }
}
