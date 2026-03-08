package Collection;
import java.util.*;
public class Tree_set1 {

	public static void main(String[] args) {
		TreeSet<Employee> ts2=new TreeSet<>();
		Employee e1= new Employee(1221," A ",21);
		Employee e2= new Employee(3445," B ",45);
		Employee e3= new Employee(233," C ",45);
		Employee e4= new Employee(1221," D ",23);
		Employee e5= new Employee(222," E ",55);
		
		ts2.add(e1);
		ts2.add(e2);
		ts2.add(e3);
		ts2.add(e4);
		ts2.add(e5);
		
		System.out.println(ts2);
	}
}
