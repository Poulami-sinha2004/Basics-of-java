package Collection;

import java.util.TreeSet;

public class ComparatorDemo {
public static void main(String[] args) {
	TreeSet<Integer> ts= new TreeSet<Integer>(new MyIntergerComparator());
			ts.add(100);
		
			ts.add(20);
			ts.add(30);
			ts.add(49);
			
			System.out.println(ts);
}
}
