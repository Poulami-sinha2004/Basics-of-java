package DSA;

class oned_array {
	public static void main(String[] args) {
		int[] arr = { 10, 30, 8, 6, 7, 2, 0 };
		int n = arr.length;
		int smallest_element = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int secondLar = Integer.MIN_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] < smallest_element) {
				secondSmall = smallest_element;
				smallest_element = arr[i];
			}
			if (arr[i] > largest) {
				secondLar = largest;
				largest = arr[i];
			}

			if (secondLar < arr[i] && arr[i] != largest) {
				secondLar = arr[i];
			}
			if (secondSmall > arr[i] && arr[i] != smallest_element) {
				secondSmall = arr[i];

			}
			

		}
		System.out.println("smallest ele :" + smallest_element + " largest :" + largest + " second largest :"
				+ secondLar + " second smallest " + secondSmall);
		
		

	}
	  // 8. Check sorted
    static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1]) return false;
        return true;
    }

    // 9. Copy array
    static int[] copy(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
        return b;
    }

    // 10. Count duplicates
    static void countDuplicates(int[] a) {
        boolean[] visited = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > 1)
                System.out.println(a[i] + " occurs " + count + " times");
        }
    }
}
