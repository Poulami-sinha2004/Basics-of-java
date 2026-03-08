package array;

public class Employee {
	String name;
	int id;
	int salary;
	Employee(){
		this.name=name;
		this.id=id;
		this.salary=salary;

}

	Employee(int id,String name,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;

}
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void display() {
		System.out.println(getID()+getName()+getSalary());
		
		
	}
}
