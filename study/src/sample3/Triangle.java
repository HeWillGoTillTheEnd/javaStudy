package sample3;

public class Triangle {
    double width;
    double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double findArea(){
        return (width * height) / 2;
    }
}
