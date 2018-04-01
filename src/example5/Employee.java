package example5;

import java.util.Scanner;

class Employee {
	private String name;
	private String department;
	private String designation;
	private Double salary;

	public String getName() {
		return name;
	}

	public void setName(String a) {
		name = a;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String a) {
		department = a;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String a) {
		designation = a;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double b) {
		salary = b;
	}

	public Double getHRA() {
		return ((20 * (salary)) / 100);
	}

	public Double getDA() {
		return ((10 * (salary)) / 100);
	}

	public Double getCA() {
		return ((10 * (salary)) / 100);
	}

	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter name:");
		name = in.nextLine();
		System.out.println("enter department:");
		department = in.nextLine();
		System.out.println("enter designation:");
		designation = in.nextLine();
		System.out.println("enter salary:");
		salary = in.nextDouble();
	}

	public void showData() {
		System.out.println("name:" + name);
		System.out.println("department:" + department);
		System.out.println("designation:" + designation);
		System.out.println("salary:" + salary);
	}

	public static void main(String args[]) {
		Employee e = new Employee();
		e.acceptData();
		e.showData();
	}
}
