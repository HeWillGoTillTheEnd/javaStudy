package sample4;

public class ArrayMultiesEx {
    public static void main(String[] args) {
        int[][] scores = {{90, 100, 80, 60, 70}, {90, 100, 80, 60, 70}, {90, 100, 80, 60, 70}};
        int[] sums = new int[3];
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                sums[i] += scores[i][j];
            }
            total += sums[i];
            System.out.println(total);
        }
        System.out.println(total);
    }
}
