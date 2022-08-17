package com.cg.constructor;

public class Employee {
	int id;
	String name;
	String country;
	public Employee(int id,String name, String country) {
		this.id=id;
		this.name=name;
		this.country=country;
	}
public Employee(int id,String name) {
	this.id=id;
	this.name=name;
}
public String toString() {
	return "Employee [id="+id+",name="+name+",country="+country+"]";
}
public static void main(String args[]) {
	Employee e=new Employee(1,"Ram","India");
	Employee e1=new Employee(2,"Sham");
	System.out.println(e);
	System.out.println(e1);
}
}
