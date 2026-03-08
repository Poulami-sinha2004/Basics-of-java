package Collection;

import java.util. TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
	
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("K");
		ts.add("Z");
		ts.add("A");
		ts.add("Z");
		
		System.out.println(ts);
		
		TreeSet<Product> ts1= new TreeSet<Product>();
		Product p1= new Product(3,"Iphone",7000);
		Product p2= new Product(5,"Iphone",70500);
		Product p3= new Product(7,"Iphone",2000);
		Product p4= new Product(8,"Iphone",55000);
		
		ts1.add(p1);
		ts1.add(p2);
		ts1.add(p3);
		ts1.add(p4);
		System.out.println(ts1);
	}

}