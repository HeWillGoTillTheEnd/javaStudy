package chapter11;

import java.util.Arrays;

public class ComparableDemo {
    public static void main(String[] args) {

        Rectangle[] rectangles = {new Rectangle(3, 5), new Rectangle(2,10),new Rectangle(5,5)};

        Arrays.stream(rectangles).forEach(System.out::println);
    }
}

class Rectangle{
    private int width, height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int findArea(){
        return width * height;
    }

    public String toString(){
        return String.format("사각형[폭=%d, 높이=%d]", width, height);
    }
}

