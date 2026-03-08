package oops.fundamenta.object_demo;

public class Student_1 {
	String name;
	int phone;
	String email;
	Student_1(String email,int phone,String name){
		this.email=email;
		this.phone=phone;
		this.name=name;
	}
	 public boolean equals(Object obj){
	        Emp_1 e = (Emp_1) obj;
	        if(e.name == this.name &&
	           e.email == this.email &&
	           e.phone == this.phone){
	            return true;
	        }
	        return false;
	    }
	
	
}
