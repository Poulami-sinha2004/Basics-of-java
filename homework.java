import java.util.*;
public class homework {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of arr");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter elements for arr");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("enter size of k");
		int d=sc.nextInt();
		ArrayList<Integer> ar= new ArrayList<>();
		for(int i=n-1;i>0;i--) {
			if(count<d) {
				ar.add(0,arr[i]);
				count++;
				
			}
			else {
				int k=0;
				while(!ar.contains(arr[k])) {
					ar.add(arr[k]);
					k++;
				}
				break;
			}
		}
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i)+" ");
			
		}
}
}

