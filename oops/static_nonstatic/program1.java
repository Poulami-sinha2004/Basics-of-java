package oops.static_nonstatic;

interface A {
	default void bark() {
		System.out.print("a");
	}
	
}
interface B {
	default void bark() {
		System.out.print("b");
		
	}
}

class C implements B,A{
	public void bark() {
		System.out.println("c counts");
		B.super.bark();
	}
	}
	

class D {

	public static void main(String[] args) {
		// Every class name is a
		// NDPT
		
		C obj1 = new C();
		obj1.bark();

	}
}
