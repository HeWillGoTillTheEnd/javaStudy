package chapter11;

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("Ok버튼을 클릭했습니다."));
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));
        btnCancel.click();

        double result = calc((x, y) -> (x / y));
        System.out.println("result: " + result);

        int max = maxOrWin(Math::max);
        int min = maxOrWin(Math::min);
        System.out.println("최대값: "+ max);

        System.out.println("최소값: "+ min);
    }

    public static double calc(Function fun) {

        double x = 10;
        double y = 4;
        return fun.apply(x, y);
    }

    private static int[] scores = {10, 50, 3};
    public static int maxOrWin(Operator operator){
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

}
@FunctionalInterface
interface Function{
    double apply(double x, double y);
}

@FunctionalInterface
interface Operator{
    public int apply(int x,int y);
}
