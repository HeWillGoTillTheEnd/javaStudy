package problems1;

public class Problem3 {
    public static void main(String[] args) {
        double[][] interests = {{3.2, 3.1, 3.2, 3.0}, {2.9, 2.8, 2.7, 2.6}, {2.7, 2.6, 2.5, 2.7}};
        double[] sum1 = {0.0, 0.0, 0.0};
        double sum2 = 0.0;
        int i = 0;
        for (double[] interest : interests) {
            for (double v : interest) {
                sum1[i] += v;
            }
            System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", i+1,sum1[i]/4);
            sum2 += sum1[i];
            i++;
        }
        System.out.printf("%d년간 평균 이자율 = %.2f%%\n", sum1.length,sum2/(3 *4));
    }
}
