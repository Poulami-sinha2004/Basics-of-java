import java.util.*;
public class productofall {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();//1234
		}
		ArrayList<Integer> ar= new ArrayList<>();
		int product=1;
		for(int i=0;i<n;i++) {
			product=1;
			for(int j=0;j<n;j++) {
				if(j!=i) {
					product=product*arr[j];
				}
			}
			ar.add(product);	
		}
System.out.println(ar);
		
	}
	

}
