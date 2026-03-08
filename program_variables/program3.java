package program_variables;

public class program3 {
	public static void main(String[] args) {
		char c='A';//2 byte
		int i=c;//4 byte
		//widening--> 2 byte--> 4 byte
		//implicit typecasting(widening)
		//explicit typecasting(narrowing)
		
		System.out.println(i);
		
		//explicit typecasting
		//narrowing
		int j=65;
		char ch=(char)j;
		System.out.println(ch);
	}

}

