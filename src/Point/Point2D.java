package Point;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY(){
        return new double[]{x, y};
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point2D (" + x + ", " + y + ")";
    }
}

class Point2DTest{
    public static void main(String[] args) {
        Point2D point2D1 = new Point2D();
        point2D1.setX(20);
        point2D1.setY(30);
        //point2D1.setXY(4,7);
        System.out.println(point2D1);

        Point2D point2D2 = new Point2D(4,7);
        System.out.println(point2D2);
        for(int i = 0; i<point2D2.getXY().length; i++){
            System.out.print(point2D2.getXY()[i] + " ");
        }

    }
}

