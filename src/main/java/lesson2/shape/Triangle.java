package lesson2.shape;

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double side1, double side2, double side3) {
        this.sideA = side1;
        this.sideB = side2;
        this.sideC = side3;
    }

    public double getSide1() {
        return sideA;
    }

    public void setSide1(double side1) {
        this.sideA = side1;
    }

    public double getSide2() {
        return sideB;
    }

    public void setSide2(double side2) {
        this.sideB = side2;
    }

    public double getSide3() {
        return sideC;
    }

    public void setSide3(double side3) {
        this.sideC = side3;
    }

    @Override
    double area() {return 0.5*(sideA * sideB * Math.sin(sideC));}

    @Override
    double perimeter() {return sideA + sideB + sideC;}

    }


