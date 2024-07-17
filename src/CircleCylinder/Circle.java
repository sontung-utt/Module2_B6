package CircleCylinder;

public class Circle {
    private double radius = 1;
    public static double PI = 3.14;
    private String color = "đen";

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public String toString(){
        return "Hình tròn có bán kính " + getRadius() + " - diện tích " + getArea() + " - chu vi " + getPerimeter()
                + " - màu sắc " + getColor() ;
    }
}

class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(5,"đen ánh đỏ formula");
        System.out.println(circle1);
    }
}
