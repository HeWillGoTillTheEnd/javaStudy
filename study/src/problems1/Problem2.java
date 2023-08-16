package problems1;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
        int arr[] = {2, 3};
        System.out.println(sum(1,arr));
        System.out.println(sum(1,2,3,4,5));
    }
    static int sum(int b, int... a){
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }


}
