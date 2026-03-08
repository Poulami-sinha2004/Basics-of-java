package array.TwoDArray;

public class program1 {
	public static void main(String[] args) {
		int[] [] a= {{100,4},{200,3}};
		for(int i=0;i<a.length;i++) {
			//outer loop to iterate array
			for(int j=0;j<a[i].length;i++) {
				//inner loop to iterate element
			System.out.println(a[i][j]+" ");
		}
			System.out.println();
		}

	}

}
