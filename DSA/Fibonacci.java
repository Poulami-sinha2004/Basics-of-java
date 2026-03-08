package DSA;

public class Fibonacci {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int n=0;
	System.out.println(a);
	System.out.println(b);
	while(n<7) {
		int sum=a+b;
			a=b;
			b=sum;
			n++;
			System.out.println(sum);
			sum=0;
	}
	
		
	}
}
