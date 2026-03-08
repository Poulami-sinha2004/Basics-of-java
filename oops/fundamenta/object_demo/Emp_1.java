package oops.fundamenta.object_demo;

public class Emp_1 {
	String name;
	int phone;
	String email;
	
	Emp_1(String email,int phone,String name){
		this.email=email;
		this.phone=phone;
		this.name=name;
	}
	public boolean equals(Object obj) {
		Student_1 st=(Student_1)obj;
		if(st.name == this.name || st.email == this.email || st.phone==this.phone) {
			return true;
		}else {
			return false;
		}
		
		
	}
	public static void main(String[] args) {
		Student_1 s1= new Student_1("polu@gmail.com",12122,"polu");
		Emp_1 e1= new Emp_1("polu@gmail.com",12122,"polu");
		System.out.println(s1.equals(e1));
	}
}
