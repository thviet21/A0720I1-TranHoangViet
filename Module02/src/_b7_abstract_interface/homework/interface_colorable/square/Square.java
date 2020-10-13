package _b7_abstract_interface.homework.interface_colorable.square;

import _b7_abstract_interface.homework.interface_resizeable.Circle.Circle;
import _b7_abstract_interface.homework.interface_resizeable.Rectangle.Rectangle;
import _b7_abstract_interface.homework.interface_resizeable.Shape.Shape;

public class Square extends Rectangle implements Colorable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "A Square with side: "
                + getSide()
                + ", which is a subclass of "
                + super.toString() + ", Area: "+ getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides: " + getColor());
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(4,"green",true);
        shapes[1] = new Rectangle(5,6,"yellow",true);
        shapes[2] = new Circle(7,"blue",true);
        for (Shape shape: shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable){
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            }
        }
    }
}
