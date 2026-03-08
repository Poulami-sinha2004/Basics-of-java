
public class homework_1 {
	public static int[][] Darray() {
		int [][] a= {{1,2},{3,4}};
		int [][] b= {{1,2},{3,4}};
		
		int row=a.length;
		int col=a[0].length;
		int [][] c=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++ ) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		return c;
}
	public static void main(String[] args) {
		int [][] arr= Darray();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}