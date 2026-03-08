package oops.fundamenta.inheritance;

public class WhiteTiger extends Tiger {

	public WhiteTiger(String name) {
		super(name);
	}

	public void roar() {
		System.out.println("White Tiger is rare");
	}
	public void whitecolor() {
		System.out.println("White Tiger is white");
	}
}