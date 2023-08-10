package sample2;


import java.util.Scanner;

/**
 * 종료를 입력할 때까지 동물의 이름을 입력받는다 입력받은 동물의 종류를 출력하라
 * while문 이용
 */
public class WildEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFind = false;
        a:while(true){
            System.out.println("동물 이름을 입력해주세요 : ");
            String name = sc.nextLine();
            String[] terrestrialAnimal = {"사자","호랑이","토끼","코끼리","하마"};
            String[] bird = {"참새","비둘기","닭","앵무새","학"};
            String[] fish = {"고등어","참치","상어","고래","금붕어"};
            for(int i =0; i<terrestrialAnimal.length;i++){
                if(isFind) break;
                if(name.equals(terrestrialAnimal[i])) {
                    System.out.println("육상동물 입니다.");
                    isFind = true;
                }
                else if(name.equals(bird[i])) {
                    System.out.println("조류 입니다.");
                    isFind = true;
                }
                else if(name.equals(fish[i])) {
                    System.out.println("물고기 입니다.");
                    isFind = true;
                }
                else if(name.equals("종료")) {
                    System.out.println("종료합니다");
                    break a;
                }
            }
            if(!isFind) System.out.println("찾을 수 없는 동물입니다 동물이름: " + name);
            isFind = false;
        }
    }
}
