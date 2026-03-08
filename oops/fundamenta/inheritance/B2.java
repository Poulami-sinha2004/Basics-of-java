package oops.fundamenta.inheritance;

public class B2 extends B1{
	public void b(int b) {
		System.out.println("b form b2 "+ b);
	}
	public void method() {
		b(20);
		super.b();
	}
}
