package _b6_inheritance.homework.point_and_movable_point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arrayXY = {getxSpeed(),getySpeed()};
        return arrayXY;
    }

    @Override
    public String toString() {
        return "Location: ("+getX()+","+getY() +"),Speed: ("+getxSpeed()+","+getySpeed()+")";

    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint move(){
        float x = super.getX();
        float y = super.getY();
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
