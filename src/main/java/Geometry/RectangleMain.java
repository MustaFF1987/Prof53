package Geometry;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(1, 1,1,1);

        rectangle.setPoint_nw1(10.12);
        rectangle.setPoint_se1(15.45);
        rectangle.setPoint_nw2(13.23);
        rectangle.setPoint_se2(12.45);

        System.out.println("Point nw1 " + rectangle.getPoint_nw1());
        System.out.println("Point nw2 " + rectangle.getPoint_nw2());
        System.out.println("Point se1 " + rectangle.getPoint_se1());
        System.out.println("Point se2 " + rectangle.getPoint_se2());
        System.out.println("Rectangle's S is: " + rectangle.area());

    }
}
