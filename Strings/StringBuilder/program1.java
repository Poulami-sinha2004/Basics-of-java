package Strings.StringBuilder;

public class program1 {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("hello");
		//StringBuffer sb= new StringBuffer();
		System.out.println(sb.length());
		sb.append("123456789123456555");
		sb.append("15");
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		//default capacity=16
		//if greater than default , formula is (old capacity)*2+2
	sb.delete(3, 6);
	System.out.println(sb);
	sb.insert(2, "student");
	System.out.println(sb);
	}
	

}
