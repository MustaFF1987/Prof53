package lesson2.shape;

public class Rectanlge extends Figure{

    private double sideA;
    private double sideB;

    public Rectanlge(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    double area() {return sideA * sideB;}

    @Override
    double perimeter() {return 2*(sideA + sideB);}

    }