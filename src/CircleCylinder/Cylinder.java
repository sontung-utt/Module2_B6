package CircleCylinder;

public class Cylinder extends Circle{
    private double height = 4;
    public Cylinder(){
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSurfaceArea(){
        return 2 * PI * getRadius() * (height + getRadius());
    }

    public double getVolume(){
        return getArea() * height;
    }

    public String toString(){
        return "Hình trụ có chiều cao " + height + " - diện tích " + getSurfaceArea() + " - thể tích " + getVolume()
                + " là con của " + super.toString();
    }
}

class CylinderTest{
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        System.out.println(c);

        Cylinder c2 = new Cylinder(5);
        System.out.println(c2);

        Cylinder c3 = new Cylinder(10,7);
        System.out.println(c3);


        Cylinder c4 = new Cylinder(7, 8, "vàng");
        System.out.println(c4);
    }
}
