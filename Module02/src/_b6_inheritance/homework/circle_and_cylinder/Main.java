package _b6_inheritance.homework.circle_and_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6,"blue");
        circle.getArea();
        System.out.println(circle);
        System.out.println("-------------------------------");

        Cylinder cylinder = new Cylinder(7,"green",7.2);
        cylinder.getCapacity();
        System.out.println(cylinder);
    }
}
