package Collection;
import java.util.*;
public class MyMovieComparator {
	public static void main(String[] args) {
		TreeSet<Movie> ts3= new TreeSet<>(new MyMovieCompare());
		Movie m1= new Movie(1,"A",12.2);
		Movie m2= new Movie(2,"B",12.4);
		Movie m3= new Movie(3,"C",10.4);
		Movie m4= new Movie(4,"D",11.4);
		
		ts3.add(m1);
		ts3.add(m2);
		ts3.add(m3);
		ts3.add(m4);
		
	
	System.out.println(ts3);
	}
	
	
}
