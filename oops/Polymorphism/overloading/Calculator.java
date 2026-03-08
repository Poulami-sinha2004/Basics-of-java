package oops.Polymorphism.overloading;

public class Calculator {

	static double calculateArea(double side) {
		double area= side*side;
		return area;
	}
	static double calculateArea(double length,double breadth) {
		double area= length*breadth;
		return area;
	}
	static float calculateArea(float radius) {
		float area= (float)3.14*radius*radius;
		return area;
	}
	public static void main(String[] args) {
		System.out.println(calculateArea(34.43));
		System.out.println(calculateArea(34.43,54.54));
		System.out.println(calculateArea(34.4));
	}
}
