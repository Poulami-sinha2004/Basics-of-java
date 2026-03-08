package DSA;

public class Missing_element {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int low1 = 0;
		int high1 = arr.length - 1;
		System.out.println(arr[BinarySearch(arr, low1, high1)] - 1);
	}

	static int BinarySearch(int[] arr, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			int diff = arr[mid] - mid;
			if (diff == arr[0]) {
				return BinarySearch(arr, mid + 1, high);
			} else {
				return BinarySearch(arr, low, mid);
			}

		} else {
			return low;
		}
	}
}
