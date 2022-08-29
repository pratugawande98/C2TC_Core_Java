package com.cg.chain;

public class Base {
	String name;Base(){
		this("");
		System.out.println("No-argument constructor of base class...");
	}
	Base(String name)
	{
		this.name=name;
		System.out.println("calling parameterized constructor of base class....");
	}

}
