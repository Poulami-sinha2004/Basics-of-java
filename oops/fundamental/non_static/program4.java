package oops.fundamental.non_static;

public class program4 {
	public static void main(String[] args) {
		person person1= new person();
		System.out.println("person1"+person1);
		person1.initialize("A",21,"MAle");
		/*
		 * person1.name="A"; person1.age=20; person1.gender="male";
		 */
		/*
		 * System.out.println(person1.name); System.out.println(person1.age);
		 * System.out.println(person1.gender);
		 */
		
		person1.display();
	}
}
