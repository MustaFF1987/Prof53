package Geometry;


// добавьте точки x и y в виде свойств
// конструктор
// геттеры и сеттеры

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(1, 1,1,1);

        rectangle.setPoint_nw1(1012.12);
        rectangle.setPoint_se1(1512.45);
        rectangle.setPoint_nw2(1334.23);
        rectangle.setPoint_se2(1234.45);

        System.out.println("Point x " + rectangle.getPoint_nw1());
        System.out.println("Point x2 " + rectangle.getPoint_nw2());
        System.out.println("Point y " + rectangle.getPoint_se1());
        System.out.println("Point y2 " + rectangle.getPoint_se2());
        System.out.println("Rectangle's area is: " + rectangle.area());
    }
}














