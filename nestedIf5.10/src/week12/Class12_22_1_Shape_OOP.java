package week12;

public class Class12_22_1_Shape_OOP {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

// Print the area of the shapes
        circle.printAreaCircle();
        rectangle.printAreaRectangle();
    }
}

class Shape {
    protected String name;

    protected double area;

    public Shape(String name) {
        this.name = name;
    }

    public void printArea() {
        System.out.println("The area of the "+name+" is: "+area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public void printAreaCircle(){
        area = 3.14 * radius * radius;
        super.printArea();
    }
}

class Rectangle extends  Shape{
    private double length;

    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public void printAreaRectangle(){
        area = length * width;
        super.printArea();
    }

}