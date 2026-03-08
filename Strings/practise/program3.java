package Strings.practise;

import java.util.HashMap;
import java.util.Map;

public class program3 {
	public static void main(String[] args) {
		String s="hello";
		HashMap<Character,Integer> hs= new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			hs.put(c,hs.getOrDefault(c,0)+1);
			
		}
		for(Map.Entry<Character,Integer> entry:hs.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
