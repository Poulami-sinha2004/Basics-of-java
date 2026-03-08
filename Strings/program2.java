package Strings;

public class program2 {
public static void main(String[] args) {
	System.out.println("d".matches("[abc]"));
	System.out.println("d".matches("[^abc]"));
//regex-->matches,split
	System.out.println("M".matches("[A-Z || a-z]"));
	System.out.println("abc".matches("[a-z]+"));
	//+ -->+ signifies it has multiple characters
	System.out.println("abcAbc".matches("[a-zA-Z]+"));
	System.out.println("abc123Abc".matches("[a-zA-Z0-9]+"));
	System.out.println("21".matches("[6-9]"));
	//false coz without + we will check only 1 character
	System.out.println("9876543210".matches("[6-9][0-9]+"));
	//[6-9] is for first character the rest is for rest of the text
	System.out.println("9876543210".matches("[6-9]\\d{9,12}"));
	System.out.println("98765432104349".matches("[6-9]\\d{9,12}"));
	
	System.out.println("9876543210".matches("[6-9]\\d+"));
}
}

