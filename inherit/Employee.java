package inherit;

public class Employee{
	int id;
	String name;
	double salary;
	
	public Employee() {
		
	}
	public Employee(int id) {
		this.id=id;
	}
	public Employee(int id,String name) {
		this(id);
		this.name=name;
	}
	public Employee(int id,String name,double salary) {
		this(id,name);
		this.salary=salary;
	}
	public static void main(String[] args) {
		Employee e= new Employee();
		e.show();
		Employee e1= new Employee(101);
		e1.show();
		Employee e2= new Employee(101,"polu");
		e2.show();
		Employee e3= new Employee(101,"polu",1234.5);
		e3.show();
	}
	void show() {
		System.out.println("id "+ id +" name "+name+" salary "+salary);
		
	}
	
}
