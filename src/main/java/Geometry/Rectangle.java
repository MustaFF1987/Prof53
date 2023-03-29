package Geometry;

public class Rectangle {
    // добавьте свойства se и nw - юго-восточная точка и северо-западная
    double Point_se1;
    double Point_se2;
    double Point_nw1;
    double Point_nw2;

    // добавьте конструктор

    public Rectangle(int point_se1, int point_se2, int point_nw1, int point_nw2) {
        Point_se1 = point_se1;
        Point_se2 = point_se2;
        Point_nw1 = point_nw1;
        Point_nw2 = point_nw2;
    }

    public double getPoint_se1() {
        return Point_se1;
    }

    public void setPoint_se1(double point_se1) {
        Point_se1 = point_se1;
    }

    public double getPoint_se2() {
        return Point_se2;
    }

    public void setPoint_se2(double point_se2) {
        Point_se2 = point_se2;
    }

    public double getPoint_nw1() {
        return Point_nw1;
    }

    public void setPoint_nw1(double point_nw1) {
        Point_nw1 = point_nw1;
    }

    public double getPoint_nw2() {
        return Point_nw2;
    }

    public void setPoint_nw2(double point_nw2) {
        Point_nw2 = point_nw2;
    }

    public double area(){
        return  (Point_se2 - Point_se1) * (Point_nw1 - Point_nw2);
    }
}


