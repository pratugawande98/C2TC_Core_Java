package com.cg.Super;

public class Employee extends Person {
float salary;
Employee(int id,String name,float salary){
	super(id,name);
	this.salary=salary;
}
void display()
{
	System.out.println(id+" "+name+" "+salary);
	
	}
}
