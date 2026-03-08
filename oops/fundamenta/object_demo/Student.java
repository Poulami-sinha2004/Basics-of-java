package oops.fundamenta.object_demo;

public class Student {
	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
	public boolean equals(Object obj) {
		Student st = (Student) obj;
		if(st.id == this.id && st.name == this.name && st.percentage==this.percentage) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Soumyojit", 80.0);
		Student s2 = new Student(1, "Soumyojit", 80.0);

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}