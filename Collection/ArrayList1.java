package Collection;
import java.util.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1
{
	public static void main(String[] args) {
		
		ArrayList<String> countries = new ArrayList<String>();
		
		countries.add("India");
		countries.add("China");
		countries.add("USA");
		countries.add("Brazil");
		
		for(String s : countries) {
			System.out.println(s);
		}
		
		System.out.println("=================================================");
		Iterator<String> itr = countries.iterator();
		
		while(itr.hasNext()) {
			
			String coun = itr.next();
			
			System.out.println(coun);
		}
		
		
		System.out.println("=====================================================");
		
		ArrayList al1 = new ArrayList();
		
		al1.add("java");
		al1.add(100);
		al1.add(100.50);
		al1.add(true);
		
		Iterator itr1 = al1.iterator();
		
		while(itr1.hasNext()) {
			
			Object obj1 = itr1.next();
			System.out.println(obj1);
			
		}
		
		System.out.println("==========================================================");
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(100);
		list3.add(200);
		list3.add(300);
		ListIterator<Integer> itr3 = list3.listIterator();
		while(itr3.hasNext()) {
			Integer num= itr3.next();
			System.out.println(num);
		}
		System.out.println("-----------------------------------------------------");
		while(itr3.hasPrevious()) {
			Integer num= itr3.previous();
			System.out.println(num);
		}
		
		
		
		
		
		
		
	}
}
//public class ArrayList1 {
//public static void main(String[] args) {
//	ArrayList<Integer> ar = new ArrayList<>();
//	ar.add(1);
//	ar.add(2);
//	ar.add(3);
//	for(int i: ar) {
//		System.out.println(ar.get(i));
//	}Iterator<Integer> itr= ar.iterator();
//	while(itr.hasNext()) {
//		Object obj1=itr.next();
//		System.out.println(obj1);
//	}
//	System.out.println("========================");
//	ArrayList al1= new ArrayList();
//	al1.add("java");
//	al1.add(100);
//	al1.add(100.50);
//	al1.add(true);
//	Iterator itr1=al1.iterator();
//	Object obj1=itr1.next();
//	System.out.println(obj1);
//	ArrayList<Integer> list3=new ArrayList<Integer>();
//	list3.add(100);
//	list3.add(200);
//	list3.add(300);
//	ListIterator<Integer> itr3=list3.listIterator();
//	while(itr3.hasNext()) {
//		Integer num=itr3.next();
//		System.out.println(num);
//	}
//	System.out.println("---------------------------");
//	while(itr3.hasPrevious()) {
//		Integer num=itr3.previous();
//		System.out.println(num);
//	}
//	
//}
//}
