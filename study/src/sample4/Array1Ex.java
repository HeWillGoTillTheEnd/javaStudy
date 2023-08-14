package sample4;

public class Array1Ex {
    public static void main(String[] args) {
        int sum, avg = 0;
        int sc1 = 90;
        int sc2 = 80;
        int sc3 = 100;

        sum = sc1 + sc2 + sc3;
        avg = sum / 3;
        int[] scores = {sc1, sc2, sc3};
        for (int a: scores) {
            sum += a;
        }
    }
}
