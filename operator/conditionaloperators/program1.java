package operator.conditionaloperators;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		// operand1?operand2:operand3

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int a = n1 > n2 ? n1 : n2;

		
		  System.out.println(true? 10: true); 
		  System.out.println(10<20? true: false);
			/* if true, operand 2 executes and if false ,operand 3 executes */
		  System.out.println(10==20? true: false); 
		  System.out.println("hello"!="hello"?true:false); 
		  System.out.println('A'==65? 10: true);
		 
		System.out.println(a);
		/*
		 * //String res=10<20?"A":true; here true is type mismatch with res boolean
		 * res=10<20?"A":true; here A is type mismatch with res
		 * 
		 */
		sc.close();
	}
}
