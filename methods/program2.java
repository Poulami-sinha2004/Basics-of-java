package methods;

public class program2 {
	public static void main(String[] args) {
		num(1, 2);
		num('A', 'B');
		// num('A',20.5);
		// compiler--> actual parameter
	}

	public static void num(int a, int b) {
		System.out.print("int,int");

	}

	public static void num(double a, double b) {
		System.out.print("double,double");

	}

	public static void num(char a, char b) {
		System.out.print("char,char");

	}

}
