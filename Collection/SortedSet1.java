package Collection;
import java.util.*;
public class SortedSet1 {
public static void main(String[] args) {
	SortedSet<Integer> ss=new TreeSet<Integer>(new MyIntergerComparator());
	ss.add(200);
	ss.add(10);
	ss.add(30);
	ss.add(40);
	ss.add(50);
	ss.add(60);
	ss.add(20);
	System.out.println(ss);
	//first
	System.out.println("first()"+ss.first());
	//last
	System.out.println("last()"+ss.last());
	//headset
	System.out.println("headset()"+ss.headSet(100));
	//tailset
	System.out.println("tailset()"+ss.tailSet(10));
	//subset
	System.out.println("subset()"+ss.subSet(60,30));
	//comparator returns the mentioned comparator
	System.out.println("comparator()"+ss.comparator());
	
	
}
}
