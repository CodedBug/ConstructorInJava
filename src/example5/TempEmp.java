package example5;

import java.util.Scanner;

class TempEmp extends Employee {
	protected char grade;
	protected int days;

	public TempEmp() {
	}

	public TempEmp(char grade, int days) {
		this.grade = grade;
		this.days = days;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public void acceptData() {
		Scanner a = new Scanner(System.in);
		super.acceptData();
		System.out.println("enter wage grade:");
		grade = a.nextLine().charAt(0);
		System.out.println("enter no. of days:");
		days = a.nextInt();
	}

	public void showData() {
		System.out.println("grade:" + grade);
		System.out.println("days:" + days);
	}

	public static void main(String args[]) {
		TempEmp t1 = new TempEmp();
		t1.acceptData();
		TempEmp t2 = new TempEmp('c', 50);
		t2.showData();
	}
}