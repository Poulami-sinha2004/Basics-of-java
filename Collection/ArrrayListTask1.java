package Collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrrayListTask1 {
public static void main(String[] args) {
	ArrayList list= new ArrayList();
	list.add(100);
	list.add(100.50);
	list.add("hello");
	list.add(true);
	list.add("world");
	
	//remove--> hello and worlListIterator<E>ator 
	
	ListIterator<Object> itr=list.listIterator();
	while(itr.hasNext()) {
		if(itr.next().equals("hello") || itr.next().equals("world")) {
			itr.remove();
		}
		
	}
	System.out.println(list);
}
}
