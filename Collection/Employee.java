package Collection;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int compareTo(Employee e1) {
		if (e1.salary > this.salary) {
			return 1;
		} else if (e1.salary == this.salary) {
			if (e1.name.compareToIgnoreCase(this.name) > 0) {
				return -1;
			} else if (e1.name.compareToIgnoreCase(this.name) < 0) {
				return 1;
			} else {
				return 0;
			}

		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "\nId: " + id + "\n" + "Name:" + name + "\n " + "Salary: " + salary;

	}
}
