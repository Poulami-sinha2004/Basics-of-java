package inherit;

public class Developer extends Employe {
	
	String technology="ggg";
	
	public Developer(int id, String name, double salary, String technology,int age) {
		super(id,name,salary,age);
//		this.technology=technology;
	}
	
	public void displayDeveloper() {
		displayEmp();
		System.out.println(technology);
	}
	
	public static void main(String[] args) {
		Developer d=new Developer(101,"NIl NITIN MUKESH",50000,"SpringBoot",21);
		d.displayDeveloper();
	}

}

