package oops.Polymorphism.overloading;
import java.util.*;
public class Cal {
	public static void main(String[] args) {
		System.out.println("Enter \n1. TO CALCULATE AREA OF SQUARE\n2. TO CALCULATE AREA OF RECTANGLE\n3. TO CALCULATE AREA OF CIRCLE");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter choices");
		int choices=sc.nextInt();
		int i=0;
		while(i<choices) {
			i++;
		switch(n) {
		case 1:
			System.out.println("enter side");
			double side=sc.nextInt();
		System.out.println(Calculator.calculateArea( side));
			break;
			
		case 2:
			System.out.println("enter length and breadth in double");
			double length=sc.nextInt();
			double breadth=sc.nextInt();
			System.out.println(Calculator.calculateArea(length,breadth));
			break;
		
		case 3:
			System.out.println("enter radius in float");
			float radius=sc.nextInt();
			
			System.out.println(Calculator.calculateArea(radius));
			break;
		
		case 4:
			System.out.println("Invalid choice");
			break;
		}
		}
		
	}
}
