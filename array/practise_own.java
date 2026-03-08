package array;

public class practise_own {
	

	public static int max_element(int[] arr) {
		int max_element = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max_element) {
				max_element = arr[i];
			}

		}
		return max_element;
	}

	public static int small_ele(int[] arr) {
		int small = Integer.MAX_VALUE;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}

		}
		return small;
	}

	public static int second_element(int[] arr) {
		int max_element = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max_element) {
				max_element = arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if (arr[i] > second_max && arr[i]!=max_element) {
				
				second_max = arr[i];
			}
//			else {
//				break;
//			}
		}
		return second_max;
	}
	
	
	public static void main(String[] args) {
		int[] arr = { 3, 7, 8, 6, 30, 5 };
		System.out.println(second_element(arr));
		System.out.println(small_ele(arr));
		System.out.println(max_element(arr));
		System.out.println(max_element(arr)-small_ele(arr));
		
		
	}

}
