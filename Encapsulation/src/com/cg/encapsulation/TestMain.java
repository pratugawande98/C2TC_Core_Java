package com.cg.encapsulation;

import java.util.Scanner;

public class TestMain {
	public static void getUserInput() {
		System.out.println("Enter the ID>>");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		System.out.println("Enter the Name>>");
		String name = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();

		Employee employee = new Employee();
		employee.setEmployeeId(id);
		employee.setEmployeeName(name);
		employee.setEmployeeCity(city);

		System.out.println("Employee Id>>" + employee.getEmployeeId());
		System.out.println("Employee Name>>" + employee.getEmployeeName());
		System.out.println("Employee City>>" + employee.getEmployeeCity());

	}

	public static void main(String[] args) {
		getUserInput();
	}
}



