package Strings.practise;

import java.util.Arrays;

public class program1 {
public static void main(String[] args) {
	String s1="anagram";
	String s2="grammer";
	if(s1.length()!=s2.length()) {
		System.out.println("no");
	}
	char [] c=s1.toCharArray();
	char [] c1=s2.toCharArray();
	Arrays.sort(c);Arrays.sort(c1);
	if(Arrays.equals(c1,c)) {
		System.out.print("yes");
		
	}
	else {
		System.out.print("no");
	}
}
}
