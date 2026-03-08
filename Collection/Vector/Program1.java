package Collection.Vector;
import java.util.*;
public class Program1 {
public static void main(String[] args) {
	
	Vector<Integer> v= new Vector<>();
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(50);
	
	v.remove(2);
	v.add(50);
	v.addFirst(23);
	v.addElement(66);
	v.addLast(44);
	v.clone();
	v.contains(88);
	v.capacity();
	v.copyInto(args);
	
}
}
