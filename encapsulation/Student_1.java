package encapsulation;

import java.util.*;

public class Student_1 {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<>();
		Student s1 = new Student(23, "AAA", 9.8);

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String name = sc.next();
			int id = sc.nextInt();
			double cgpa = sc.nextDouble();
			ar.add(new Student(id, name, cgpa));

		}
		for (int i = 0; i < 2; i++) {
			System.out.println(ar.get(i).getId());

		}
	}
}
