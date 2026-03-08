package Collection.HashMap;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Employee,String> hm= new HashMap<Employee,String>();
		Employee e1= new Employee(1,"Rohit",30000);
		Employee e2= new Employee(2,"fohit",30000);
		hm.put(e1,"hr");
		hm.put(e2,"developer");
		System.out.println(hm);
	}
}
