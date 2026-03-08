package operator.increment_decrement_operator;

public class program1 {
	public static void main(String[] args) {
		int a=10;int b=9;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(b++ + ++a + b++ + a++);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);
		int c=b++ + ++a + a--+ --b;
		int d=a++ + --a + a--;
		System.out.println(c+""+d);
	}

}
