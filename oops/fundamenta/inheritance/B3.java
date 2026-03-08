package oops.fundamenta.inheritance;

public class B3 extends B2 {

	public void b() {
		System.out.println("b from b3 is printing");
	}
	public void method() {
		b();
		super.method();
	}


	public static void main(String[] args) {
		B3 b3= new B3();
		
		b3.method();
}
}
