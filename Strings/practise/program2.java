package Strings.practise;

public class program2 {
public static void main(String[] args) {
	String s="java is an oop lang";
	String [] m= s.split(" ");
	String f="";
	for(String i:m) {
		f=f+" "+rev(i);
	}
	System.out.print(f);
}
public static String rev(String str) {
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	return rev;
}
}
