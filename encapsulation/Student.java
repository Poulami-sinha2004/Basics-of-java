package encapsulation;

public class Student{
	private int id;
	private String name;
	private double cgpa;
	Student(int id,String name){
		this.name=name;
		this.id=id;
		
//		setName(name);
//		setId(id);
//		setCgpa(cgpa);
//		
		
	}
	 Student(int id,String name,double cgpa){
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}
	Student(String name,int id,double cgpa){
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}
	Student(double cgpa,int id,String name){
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}
	
	//setter method
//	public void setId(int id) {
//		this.id=id;
//		
//	}
//	public void setName(String name) {
//		this.name=name;
//		
//	}
//	public void setCgpa(double cgpa) {
//		this.cgpa=cgpa;
//		
//	}
//	
	//getter method
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return cgpa;
	}
	
	
	public void display() {
		getId();
		getName();
		getCgpa();
	}
	
	
}
