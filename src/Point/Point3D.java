package Point;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3D extends Point2D{
    private double z;

    public Point3D(){
    }

    public Point3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    public double getZ(){
        return z;
    }

    public void setZ(double z){
        this.z = z;
    }

    public double[] getXYZ(){
        return new double[]{getX(), getY(), z};
    }

    public void setXYZ(double x, double y, double z){
        setX(x);
        setY(y);
        this.z = z;
    }

    public String toString(){
        return "Point3D(" + getX() + ", " + getY() + ", " + z + ')';
    }
}

class Point3DTest{
    public static void main(String[] args) {
        Point3D p = new Point3D();
        p.setXYZ(8, 4, 7);
        p.setY(10);
        System.out.println(p);

        Point3D p1 = new Point3D(11.0,29.0,8.0);
        System.out.println(p1);

        System.out.println(Arrays.toString(p.getXYZ()));

        for (int i = 0; i < p1.getXYZ().length; i++){
            System.out.print(p1.getXYZ()[i] + " ");
        }
    }
}
