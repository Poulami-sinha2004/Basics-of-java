package methods;

public class program6 {
public static void main(String[] args) {
	int n=5;int m=8;
	int k=n/2;int b=m/2;
	for(int i=0;i<n;i++) {
		for(int j=1;j<m;j++) {
			if(j==b || i==k) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
	
}
}
