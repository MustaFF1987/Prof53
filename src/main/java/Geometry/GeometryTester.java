package Geometry;

public class GeometryTester {
    public static void main(String[] args) {
        Point p1 = new Point(10,5);
        Point p2 = new Point (30,50);

        Rectangle r = new Rectangle(p1,p2);

        System.out.println("Rectangles area is: " + (int)r.area()+" cm");
    }
}
