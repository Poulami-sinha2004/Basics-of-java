package oops.fundamental.non_static;

public class person{
	 String name; int age;
	 String gender;
	 
	 person(){
		 System.out.print("no argument");
	 }
	 person(int a){
		 System.out.print("argument constructor");
	 }
	public void display() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("gender : "+gender);
		
	}
	public void initialize(String a,int b,String c) {
//	System.out.println("this"+this);
		this.name=a;
		this.age=b;
		this.gender=c;
	}

}
