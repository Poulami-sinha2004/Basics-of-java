package oops.fundamenta.inheritance;


public class Animal {

	String name;

	public Animal(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + " is eating");
	}


		public void sound() {
			System.out.println("Animal makes sound");
		}
		public void walk() {
	        System.out.println("Tiger walks");
	    }
}