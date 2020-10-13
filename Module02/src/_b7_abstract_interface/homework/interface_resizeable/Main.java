package _b7_abstract_interface.homework.interface_resizeable;

import _b7_abstract_interface.homework.interface_resizeable.Circle.Circle;
import _b7_abstract_interface.homework.interface_resizeable.Rectangle.Rectangle;
import _b7_abstract_interface.homework.interface_resizeable.Shape.Shape;
import _b7_abstract_interface.homework.interface_resizeable.Square.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(5,"green",true);
        shapes[2] = new Rectangle(3,4,"red",false);
        System.out.println("Before resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("------------------");
        for (Shape shape : shapes){
            shape.resize((Math.random()*100+1)/100  );
            System.out.println(shape);
        }
    }
}
