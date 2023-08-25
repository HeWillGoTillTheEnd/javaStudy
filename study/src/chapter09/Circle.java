package chapter09;

public class Circle{
    int half;

    public Circle(int half) {
        this.half = half;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Circle circle){
            if(circle != null && this.half == circle.half){
                return true;
            }
        }
        return false;
    }
}
