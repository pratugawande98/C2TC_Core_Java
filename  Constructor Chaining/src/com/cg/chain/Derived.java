package com.cg.chain;

public class Derived extends Base {
	Derived()
	{
		System.out.println("No argument constructor of base class...");
	}
	Derived(String name){
		super(name);
		System.out.println("Calling parameterized constructor of derived class");
	}
	public static void main(String args[])
	{
		Derived derived=new Derived("test");
	}
}
