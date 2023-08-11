package sample3;

import java.util.Scanner;

public class ObjectEx {

    boolean status;
    String on = "켜짐";
    String off = "꺼짐";

    public void turnOn(){
        status = true;
        System.out.println(on);
    }

    public void turnOff(){
        status = false;
        System.out.println(off);
    }

    class Car{
        private int speed;
        private String direction;

        public void breaking(int speed){
            if(speed> 0) {
                speed = 0;
                System.out.println("끼이익~~~ 멈췄습니다");
            }
            else if(speed == 0) {
                System.out.println("...아무일도 없었다.");
            }
        }

        public void exelerate(int speed){
            if(speed == 0) {
                System.out.println("부릉부릉~~~ 시동을 겁니다");
                speed += 30;
            }else if(speed >= 30){
                System.out.println("끼얏호우!! 속도를 더 올립니다!");
                speed += 30;
            }
        }

        public void changeDirection(String direction){
            Scanner sc = new Scanner(System.in);
            System.out.println("방향을 입력해주세요. 1.전진, 2.후진, 3.왼쪽, 4.오른쪽");

            int input = sc.nextInt();

            if(input == 1) {
                System.out.println("앞으로 쭉 갑니다!");
                direction = "전진";
            }else if(input == 2) {
                System.out.println("후진합니다!!");
                direction = "후진";
            }else if (input == 3){
                System.out.println("왼쪽으로 갑니다!");
                direction = "왼쪽";
            } else if(input == 4){
                System.out.println("오른쪽으로 갑니다!");
                direction = "오른쪽";
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                changeDirection(direction);
            }

        }
    }
}
