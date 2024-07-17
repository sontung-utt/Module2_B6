package Excercise;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return (width + length) * 2;
    }

    public String toString(){
        return "Hình chữ nhật có chiều dài " + length + " - chiều rộng " + width + " - diện tích " + getArea()
                + " - chu vi: " + getPerimeter() + " " + super.toString();
    }
}

class RectangleTest{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(5.0,8.0);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle("đỏ",true,6,10);
        System.out.println(rectangle2);

    }
}
