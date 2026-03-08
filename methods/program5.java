package methods;

public class program5 {
	public static void main(String[] args) {
		int n=8;int a=n/2; int b=n/2;
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(a<j && b>j) {
					System.out.print(" ");
				}
				else if(j==a || j==b) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<4) {
				a--;b++;
			}
			else {
				a++;b--;
			}
			System.out.println();
			
		}
	}
}
