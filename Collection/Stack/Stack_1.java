package Collection.Stack;

import java.util.*;

public class Stack_1 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
		s.push(80);
		s.push(70);
		s.push(50);
		s.push(40);
		s.push(20);
		System.out.println(s);
		while (!s.isEmpty()) {
			s.pop();
		}
		System.out.println(s);

	}

}
