package B5.AccessModifierAndStatic.Homework.AccessModifier;
class Circle {


    private double radius ;
    private String color ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

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

    public double getArea(){
        double area = Math.PI * (getRadius()*getRadius());
        return area;
    }

    public static void main(String[] args) {
//        Circle  circle = new Circle(6-);
//        System.out.println(circle.getArea());
//        Circle circle1 = new Circle();
//        circle1.setRadius(5);
//        circle1.setColor("Green");
//        System.out.println(circle1.getArea()+" " + circle1.getColor());
        Circle circle2 = new Circle();
        System.out.println("Circle khi chưa set thuộc tính:");
        System.out.println(circle2.radius);
        System.out.println(circle2.color);
        System.out.println("--------------------");
        circle2.setRadius(5.2);
        circle2.setColor("Green");
        System.out.println("Circle sau khi set thuộc tính:");
        System.out.println(circle2.radius);
        System.out.println(circle2.color);
    }
}
