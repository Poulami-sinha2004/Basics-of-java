package array;

public class program4 {
	public static void main(String[] args) {
		Employee[] employee = new Employee[3];
		employee[0] = new Employee(1, " ADAM ", 20000);
		employee[1] = new Employee(1, " miller ", 30000);
		employee[2] = new Employee(3, " king ", 330000);
		for (int i = 0; i < employee.length; i++) {
			employee[i].display();
		}
	}

}
