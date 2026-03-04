// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Triangle.java

package mte2.shapes;


public class Triangle implements Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double area() {
        double s = perimeter() / 2; 
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}