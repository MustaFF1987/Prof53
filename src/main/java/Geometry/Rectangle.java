package Geometry;

public class Rectangle {

    private Point se;
    private Point nw;

    public Rectangle(Point se, Point nw) {
        this.se = se;
        this.nw = nw;
    }

    public Point getSe() {
        return se;
    }

    public void setSe(Point se) {
        this.se = se;
    }

    public Point getNw() {
        return nw;
    }

    public void setNw(Point nw) {
        this.nw = nw;
    }

    double area(){

        double sizeX = se.getX() - nw.getY();
        double sizeY = se.getY() - nw.getX();
        return sizeY * sizeX;
    }
}
