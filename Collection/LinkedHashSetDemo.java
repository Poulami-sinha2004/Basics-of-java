package Collection;
import java.util.*;
public class LinkedHashSetDemo {
public static void main(String[] args) {
	LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
	lhs.add(100);
	lhs.add(30);
	lhs.add(70);
	lhs.add(80);
	
	for(int i: lhs) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	Iterator<Integer> itr= lhs.iterator();
	
	while(itr.hasNext()) {
		Integer ie=itr.next();
		System.out.println(ie);
	}
	String[] arr= {"1","2","3","4"};
	
	List<String> ar= new ArrayList<>(Arrays.asList(arr));

		System.out.println(ar);
	
	
//	Iterator<String>its=ar.iterator();
//	while(itr.hasNext()) {
//		String ir=(Strin)itr.next();
//		System.out.println(ir+ " ");
//	}
		
	
	
	
	
}
}
