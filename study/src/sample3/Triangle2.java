package sample3;

public class Triangle2 {
    double width;
    double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Triangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double findArea(){
        return (width * height) / 2;
    }

    public boolean isSameArea(Triangle2 t2){
        double A = this.findArea();
        double B = t2.findArea();
        if(A == B) return true;
        else return false;
    }
}
