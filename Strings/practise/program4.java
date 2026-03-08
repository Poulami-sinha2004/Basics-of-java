package Strings.practise;

import java.util.HashSet;

public class program4 {
	public static void main(String[] args) {
		String s="Hello";
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(!hs.contains(c)) {
				hs.add(c);
			}
			
		}
		System.out.println(hs);
	}
}
