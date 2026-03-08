package methods;

import java.util.*;

public class program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		int sum = 0;
		int temp = n;
		while (temp > 0) {
			int a = temp % 10;
			temp = temp / 10;
			for (int i = 1; i <= a; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			fact = 1;
		}
		if (n == sum) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
	}
}
