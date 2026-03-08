package oops.Polymorphism.overriding;

import java.util.*;

public class SalaryCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many employees to add");

		int n = sc.nextInt();

		Employee[] employees = new Employee[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the emloyee id");
			int id = sc.nextInt();
			System.out.println("Enter the emloyee name");
			String name = sc.next();

			System.out.println("1. Permanent Employee");
			System.out.println("2. Payroll Employee");

			System.out.println("Choose the option");

			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1:
				System.out.println("Enter the basic salary");
				double salary = sc.nextDouble();
				permanantemployee pe = new permanantemployee(id, name, salary);
				employees[i] = pe;
				break;
				
			case 2:
				System.out.println("Enter the hours");
				int hours = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the rate");
				double rate = sc.nextDouble();
				sc.nextLine();
				PayRollEmployee payemp = new PayRollEmployee(id, name, hours, rate);
				employees[i] = payemp;
				break;
				
			default:
				break;
			}
		
		}
		for(Employee employee : employees) {
			employee.displayDetails();
			System.out.println(employee.calculateSalary());
		
	}
	}
}
