package com.java.test.book.programs;

import java.util.Scanner;

class EmployeeDetails {

	int id;
	String employeeName;
	String dept;
	double salary;

	EmployeeDetails(int id, String employeeName, String dept, double salary) {

		this.id = id;
		this.employeeName = employeeName;
		this.dept = dept;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", employeeName=" + employeeName + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}

}

public class AcceptingEmployeeDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");

		int id = sc.nextInt();

		System.out.println("Enter a Employee Name");

		String employeeName = sc.next();

		System.out.println("Enter a Dept");

		String dept = sc.next();

		System.out.println("Enter a Salary");
		double salary = sc.nextDouble();

		EmployeeDetails emp = new EmployeeDetails(id, employeeName, dept, salary);

		System.out.println(emp.toString());
	}
}
