package com.test;

public class PolymorphismApplication {
public static void main(String[] args) {
	  CircleArea ca = new CircleArea();
	  SquareArea sa = new SquareArea();
	  RectangleArea ra = new RectangleArea();
	  TriangleArea ta = new TriangleArea();

	  System.out.println("Circle area = "+ ca.area(1));
	  System.out.println("Square area = "+ sa.area(2));
	  System.out.println("Rectangle area = "+ ra.area(3,4));
}
}
