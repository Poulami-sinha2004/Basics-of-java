package looping_tmt.loops;

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int v = 0;
		int z = 1;
		int n = sc.nextInt();
		while (n != 0) {
			b = n % 10;
			v = b + v;
			z = z * b;
			n = n / 10;
		}
		if(z==v) {
			System.out.print("spy nos");
		}
		else {
			System.out.print("not");
		}
		
	}

}
