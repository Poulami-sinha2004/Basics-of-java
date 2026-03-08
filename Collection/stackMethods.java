package Collection;
import java.util.*;
public class stackMethods {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println(stack);
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		
		System.out.println("pushed"+stack);
		System.out.println("popped"+stack.pop());
		System.out.println("peek"+stack.peek());
		System.out.println("after peek"+stack.peek());
		System.out.println("empty"+stack.empty());
		System.out.println("search()"+stack.search(400));
		
	}
}
