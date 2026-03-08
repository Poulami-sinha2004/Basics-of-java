package looping_tmt.loops;

public class program9 {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 9; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int l = 1; l <= 9; l++) {
			for (int d = 0; d < l; d++) {
				System.out.print(" ");
			}
			for (int f = 9; f > l; f--) {
				System.out.print("*" + " ");
			}

			System.out.println();
		}

	}
}
