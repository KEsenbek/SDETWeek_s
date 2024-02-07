package week13;

public class Class13_5_3_Geometry_Utility_Overloads_Methods_Polymorphism_OOP {
    public static void main(String[] args) {

    }
}

class GeometryUtility {

    public static double calculateArea(double sideLength) {
        return  sideLength*sideLength;
    }

    public static double calculateArea(double length, double width) {
        return length*width;
    }

    public static double calculateArea(int radius) {
        return 3.14 * radius * radius;
    }
}