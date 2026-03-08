package Strings.practise;
import java.util.*;
public class program5 {
public static void main(String[] args) {
////	StringBuilder s= new StringBuilder("abbacd");
String s="abbacd";
 ArrayList<Character> ar= new ArrayList<>();
	for(Character c: s.toCharArray()) {
		ar.add(c);
		
	}
	
	int n=s.length();int left=0;
	while(left<ar.size()-1) {

		if(ar.get(left).equals(ar.get(left+1))) {
			
			ar.remove(left);
			ar.remove(left);
			left=0;
			
		}
		else {
			left++;

	}
	}
	System.out.print(ar);

}
}
