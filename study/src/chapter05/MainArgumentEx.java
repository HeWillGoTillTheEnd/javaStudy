package chapter05;

public class MainArgumentEx {
    public static void main(String[] args) {
        String[] argsTest = {"안녕","25"};
        IncrementEx.main(argsTest);
        //인자가 3개 들어와야 되며 2번째 인자로 입력된 숫자만큼 첫번째 인자로 입력된 문자를 출력
        // 안녕 3 == 안녕!\n 안녕!\n 안녕!\n

    }
}
