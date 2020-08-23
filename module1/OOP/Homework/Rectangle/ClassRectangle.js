class Rectangle  {
    constructor(length,width){
        this.length = length;
        this.width = width;
    }
    getLength = function () {
        return length;
    };
    getWidth = function () {
        return width;
    };
    getArea = function () {
        return this.length * this.width;
    };
    getPerimeter = function () {
        return (this.length*this.width)*2;
    };
    setLength = function (length) {
        this.length = length;
    };
    setWidth = function (length) {
        this.length = length;
    };
}
let rectangle = new Rectangle(20,10);
document.writeln("Diện tích: " + rectangle.getArea()+"\n");
document.writeln("Chu vi: "+ rectangle.getPerimeter()+"\n");
document.writeln(rectangle.length);
document.writeln(rectangle.width);
rectangle.setLength(50);
rectangle.setWidth(23);
document.writeln("Diện tích: " + rectangle.getArea()+"\n");
document.writeln("Chu vi: "+ rectangle.getPerimeter() + "\n");