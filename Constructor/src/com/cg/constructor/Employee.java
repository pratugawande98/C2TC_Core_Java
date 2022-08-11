package com.cg.constructor;

public class Employee {
	int id;
	String name;
	String country;

	public Employee(int id, String name, String country) {//1st constructor
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	public Employee(int id, String name) {//2nd constructor
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

	public static void main(String[] args) {

		Employee e = new Employee(1, "Akanksha", "India");
		Employee e1 = new Employee(2, "Pratiksha");
		System.out.println(e);
		System.out.println(e1);
	}
}




