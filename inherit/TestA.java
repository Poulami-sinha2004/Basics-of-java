package inherit;

public class TestA {
	public TestA() {
		System.out.println("test at(int a)");
	}
	public TestA(int a) {
		System.out.println("test a()");
	}
}

class TestB extends TestA{
	public TestB() {
		super(10);
//		super();
		System.out.println("TestB");
	}
	public static void main(String[] args) {
		TestB obj= new TestB();
		
	}
}

