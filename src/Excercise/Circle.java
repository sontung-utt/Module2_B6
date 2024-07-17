package Excercise;

public class Circle extends Shape{
    private double radius = 1.0;
    private static double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public String toString() {
        return "Hình tròn có bán kính " + getRadius() + " - diện tích: " + getArea() + " - chu vi: " + getPerimeter()
                + " " + super.toString();
    }

}

class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(5);
        System.out.println(circle1);

        Circle circle2 = new Circle(7,"đen",false);
        System.out.println(circle2);
    }
}
