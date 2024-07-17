package Excercise;

public class Shape {
    private String color = "vàng";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Hình có màu " + getColor() + " và " + (isFilled() ? "chứa đầy" : "không đầy");
    }
}

class ShapeTest{
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1);

        Shape s2 = new Shape("đỏ", false);
        System.out.println(s2);
    }
}
