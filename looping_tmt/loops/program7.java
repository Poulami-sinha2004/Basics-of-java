package looping_tmt.loops;

public class program7 {
	public static void main(String[] args) {
		int n=6;int i=1;int sum=0;
		while(i<n) {
			if(n%i==0) {
				sum=sum+i;
				i++;
			}
			else {
				i++;
			}
		}
		if(sum==n) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("no");
		}
	}
}
