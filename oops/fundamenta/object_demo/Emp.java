package oops.fundamenta.object_demo;

public class Emp {
	int id;
	String name;

	public String toString() {
		String s = id + " " + name;
		return s;
	}
	
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Emp Emp = new Emp(101,"polu");
		System.out.println(Emp);
	}
}
