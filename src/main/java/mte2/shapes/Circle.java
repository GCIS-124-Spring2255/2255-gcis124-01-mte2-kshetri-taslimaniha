// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Circle.java

package mte2.shapes;

/* 

Q1. Write a Java program (Shape.java) for Shape interface (inside the shapes package) with two double methods as perimeter ( ) and area ( ). 
Implement a Circle class (Circle.java) from Shape interface with immutable variable radius, a constructor, and two ([at]Override) methods to compute perimeter of circle and area of circle. 
Implement the same Shape interface for Rectangle class (Rectangle.java with constructor and same two override methods to compute perimeter and area of Rectangle) with immutable variables length and width. 
Finally, implement the same Shape interface for Triangle class (Triangle.java with constructor and same two override methods to compute perimeter and area of Triangle) with variables sideA, sideB, and sideC. 
[Hint: for Circle: P=2πr, A= πr2, for Rectangle: P=2(l+w), A=l*w,  for Triangle: P=a+b+c, A=√[s(s-a)(s-b)(s-c)] where s=(a+b+c)/2]

*/


public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}


 