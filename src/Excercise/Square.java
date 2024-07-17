package Excercise;

public class Square extends Rectangle{
    private double side = 1;
    public Square(){
    }

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        //this.side = side;
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double width){
        setSide(width);
    }

    public void setLength(double length){
        setSide(length);
    }

    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return side * 4;
    }

    public String toString(){
        return "Hình vuông có cạnh là " + getSide() + " - diện tích " + getArea() + " - chu vi " + getPerimeter()
                + " " + super.toString();
    }
}

class SquareTest{
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        Square square2 = new Square(6);
        System.out.println(square2);

        Square square3 = new Square(4.5,"xám",false);
        System.out.println(square3);
    }
}
