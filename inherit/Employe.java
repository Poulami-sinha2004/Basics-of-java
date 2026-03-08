package inherit;

public class Employe extends Person{
	int id;
	String name;
	double salary;
	String a="vvvv";
	public Employe(int id,String name,double salary, int age) {
		super(age);
		this.id=id;
		this.name=name;
		this.salary=salary;
		
		
	}
	public void displayEmp() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		displayPer();
		System.out.println(a);
		
	}
	
	
}
