package looping_tmt.loops;

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = 0, sum = 0;
		int temp = n * n;
		while (temp > 0) {
			b = temp % 10;

			sum = sum + b;
			temp = temp / 10;
		}
		if (sum == n) {
			System.out.print("neeon nos");
		} else {
			System.out.print("not");
		}
	}
}
