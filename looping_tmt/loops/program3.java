package looping_tmt.loops;

import java.util.*;

public class program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String b = "";
		while (n > 0) {
			b = b + n % 2;
			n = n / 2;

		}
		for (int i = b.length() - 1; i >= 0; i--) {
			System.out.print(b.charAt(i));
		}
	}
}
