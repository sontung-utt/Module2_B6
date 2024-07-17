package Moveable;

public class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{x, y};
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class PointCheck{
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(5.f);
        System.out.println(p1.getX());
        System.out.println(p1);

        Point p2 = new Point(6.f,7.f);
        p2.setY(4.f);
        System.out.println(p2);

    }
}
