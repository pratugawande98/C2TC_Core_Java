package com.cg.student;

public class Student1 {
	int id;
	String name;
	String country;

	public Student1(int id, String name, String country) {//1st constructor
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	public Student1(int id, String name) {//2nd constructor
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

	public static void main(String[] args) {

		Student1 s = new Student1(1, "Akanksha", "India");
		Student1 s1 = new Student1(2, "Pratiksha");
		System.out.println(s);
		System.out.println(s1);
	}
}







