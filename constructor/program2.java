package constructor;
public class program2 {

	static {
		System.out.println("static block 1");
	}
	
	{
		System.out.println("non-static block 1");
	}

	int a=demo();//non-static initializer
	public static void main(String[] args) {
		
		new program2();
		new program2(10);
		
	}
	
	{
		System.out.println("non-static block 2");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	program2(){
		System.out.println("Program1()");
	}
	
	program2(int a){
		System.out.println("Program1(int a)");
	}
	
	public int demo() {
		System.out.println("demo()");
		return 10;
	}
}