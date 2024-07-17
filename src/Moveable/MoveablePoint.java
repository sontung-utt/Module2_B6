package Moveable;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(){
    }

    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{xSpeed, ySpeed};
    }

    public MoveablePoint move(){
        setX(xSpeed + getX());
        setY(ySpeed + getY());
        return this;
    }

    public String toString(){
        return super.toString() + " Speed(" + xSpeed + ", " + ySpeed + ")";
    }
}

class MoveablePointTest{
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setSpeed(4,8);
        moveablePoint.setX(6);
        System.out.println(moveablePoint);

        MoveablePoint moveablePoint1 = new MoveablePoint(5,7,8,9);
        moveablePoint1.move();
        moveablePoint1.setY(11);
        moveablePoint1.move();
        System.out.println(moveablePoint1);
    }
}