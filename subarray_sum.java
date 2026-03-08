public class subarray_sum {
	public static void main(String[] args) {


		        int[] arr = {1,2,3,4};
		        int n = arr.length;
		        int totalSum = 0;

		        for (int i = 0; i < n; i++) {
		            int curr = 0;
		            for (int j = i; j < n; j++) {
		                curr =curr+arr[j];
		                totalSum =totalSum+curr;
		            }
		        }

		        System.out.println(totalSum);
		    }
		}
	

