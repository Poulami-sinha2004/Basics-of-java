package Strings;

public class program3 {
	public static void main(String[] args) {
		String s = "helloABWX";
		System.out.println(s.matches("\\w+"));
		// w is word/letters

		String s1 = " ";
		System.out.println(s1.matches("\\s+"));
		// s is for space

		String sw = "java!w#qse(";
		String[] s2 = sw.split("[!#(]");

		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		
		String f="@!#%^&";
		System.out.println(f.matches("[^a-zA-Z0-9]+"));
		
		//valid mail 
		String gw="harish$hp@gmail.com";
		System.out.println(gw.matches("[A-za-z][A-za-z0-9.$]+[@][A-za-z]+[.][a-zA-z]+"));
				
	}
	
	
}
