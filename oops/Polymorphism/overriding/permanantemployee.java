package oops.Polymorphism.overriding;

public class permanantemployee extends Employee {
	double basicsalary;
	public permanantemployee(int id,String name,double basicsalary) {
		super(id,name);
		this.basicsalary=basicsalary;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("basic salary"+basicsalary);
	}
	public double calculateSalary() {
		return basicsalary+(basicsalary*0.20)+(basicsalary*0.10);
	}

}
