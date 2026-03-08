package looping_tmt.loops;

public class program6 {
	public static void main(String[] args) {
		int n = 12;
		int h = n;
		int count = 0;
		int temp = n * n;
		while (h > 0) {
			h = h / 10;
			count++;
		}
		int x = 0;
		int w = count;
		while (w > 0) {
			if (temp % 10 == n % 10) {
				x = x + 1;
			}
			w--;
		}
		if (x == count) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
