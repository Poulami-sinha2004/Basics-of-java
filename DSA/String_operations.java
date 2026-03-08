package DSA;
import java.util.*;
public class String_operations {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
	}
	static int noofchar(String s) {
		int count=0;
				char[] c= s.toCharArray();
				for(char i:c) {
					count++;
				}
				return count;
			}
	
	static void vowels_const(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a' ||c=='e' || c=='i'||c=='o'|| c=='u') {
				count++;
			}
		}
		int consonants=s.length()-count;
		System.out.println(count+" "+consonants);
	}
	

}

