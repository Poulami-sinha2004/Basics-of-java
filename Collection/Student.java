package Collection;

import java.util.*;

class Student {
	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	public double getper() {
		return percentage;
	}

	public void display() {
		System.out.println(" id " + id + "\n name " + name + " \npercentage " + percentage);
	}

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1212, "polu", 34.44));
		list.add(new Student(1234, "soumyo", 65.44));
		list.add(new Student(1256, "zebra", 44.44));
		list.add(new Student(1212, "kalia", 33.44));

		Iterator<Student> itr4 = list.iterator();
		while (itr4.hasNext()) {
			Student s=itr4.next();
			double f= s.getper();
			if(f>40) {
				s.display();
			}
		}
	}
}
