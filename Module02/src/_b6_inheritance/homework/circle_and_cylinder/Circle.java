package _b6_inheritance.homework.circle_and_cylinder;

public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Radius is" + getRadius() + ". Color is: " + getColor() + "\n Area is: " + getArea();
    }
    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }
}
