package com.cg.Inheritance;


	class Parent
	{
		void print()
		{
			System.out.println("Hello,What's going on?");
		}
	}
	class Child extends Parent
	{
		void display()
		{
			System.out.println("Child class");
		}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c= new Child();
		c.display();
		c.print();

	}

}
