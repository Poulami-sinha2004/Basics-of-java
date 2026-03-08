package codeforces;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int n = arr.length;
		System.out.println(new A().findIndex(0, n - 1, arr));

	}

	public int findIndex(int low, int high, int[] arr) {
		low = 0;
		high = arr.length - 1;

		while (low < high) {
			if (low == high)
				break;

			int mid = low + (high - low) / 2;

			if (arr[mid] == 0) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if (arr[low] == 1) {
			return low;
		}
		return -1;
	}
}
