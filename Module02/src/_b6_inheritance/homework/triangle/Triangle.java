package _b6_inheritance.homework.triangle;

import _b6_inheritance.practice.Shape.Shape;

public class Triangle extends Shape {
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea(){
        return Math.sqrt(getPerimeter()*(getPerimeter() - getSide1()*(getPerimeter()-getSide2())*(getPerimeter()-getSide3())));
    }
    public double getPerimeter(){
        return (getSide1()+getSide2()+getSide3())/2;
    }

    @Override
    public String toString() {
        return "Triangle: \n" + "Cạnh a: " + side1 +", Cạnh b: " + side2 +", Cạnh c: " + side3 + "\nChu vi: " + getPerimeter() +
                "\nDiện tích:" +getArea();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.4,5.4,32.3);
        System.out.println("Chu vi: " + triangle.getArea());
        System.out.println("Diện tích: " + triangle.getPerimeter());
        System.out.println("Thông tin Tam giác: \n" + triangle.toString());
    }
}
