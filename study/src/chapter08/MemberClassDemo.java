package chapter08;

public class MemberClassDemo {
    private String secret = "비공개";
    String s = "외부";

    class MemberClass {
        String s = "내부";
        public void show1() {
            System.out.println("내부 클래스");
            System.out.println(secret);

            System.out.println(s);
            System.out.println(MemberClassDemo.this.s);
        }
    }
}
