package _b6.inheritance.homework.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getCapacity(){
        return Math.PI * (getRadius() * getRadius()) * getHeight();
    }
    public String toString(){
        return "Radius is: " + getRadius() + ". Color is: " + getColor() + "Height: " + getHeight() + "\n Capacity: " + getCapacity();
    }
}
