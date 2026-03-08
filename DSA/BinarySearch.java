package DSA;

public class BinarySearch {
	static int binarySearch(int[] arr,int key) {
		int low=0;int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
		
		}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int key=50;
		binarySearch(arr,key);
		}
	}
