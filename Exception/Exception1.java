package Exception;

import java.util.*;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("program started");
		Scanner sc = new Scanner(System.in);
//	try {
//		System.out.println(10/0);
//	}
//	catch(ArithmeticException e){
//		System.out.println("cannot divide by 0");
//	
//	}
//	catch(RuntimeException e) {
//		System.out.println(e.getMessage());
//	
//	}
//	catch(Exception e){
//		System.out.println(e.getMessage());
//	
//	}
//	catch(Throwable e) {
//		System.out.println(e.getMessage());
//	}

		int[] arr = new int[4];
		try {
			for (int i = 0; i < 6; i++) {
				arr[i] = sc.nextInt();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception found");
		} finally {
			System.out.println("exception handled");
		}
	}
}
