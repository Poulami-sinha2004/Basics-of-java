package Collection;
import java.util.*;
public class TraverseDemo {
	public static void main(String[] args) {
		ArrayList<String> l= new ArrayList<String>();
		l.add("java");
		l.add("python");
		l.add("c");
		
		//for each-->only forward
		//we cannot remove elements
//		for(String s:l) {
////			if(s.equals("python")) {
////				l.remove(s);			}
//			System.out.println(s);
//		}
//		System.out.println("-----------------------");
//		Iterator<String> itr=l.iterator();
//		while(itr.hasNext()) {
//			if(itr.next().equals("python")) {
//				itr.remove();
//			}
////			System.out.println(itr.next());
//		}
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		System.out.println("-----------------------------");
		ListIterator<String> itr2= l.listIterator();
		System.out.println(l);
		while(itr2.hasNext()) {
			if(itr2.next().equals("python")) {
				itr2.add("ruby");
			}
			System.out.println(l);
		}
	}
}

//			else {
//				System.out.println("not found");
//			}
////			System.out.println(itr2.next());
//		}
//		System.out.println("----------");
////		while(itr2.hasPrevious()) {
//			System.out.println(itr2.previous());
//		}
//	}
//}
