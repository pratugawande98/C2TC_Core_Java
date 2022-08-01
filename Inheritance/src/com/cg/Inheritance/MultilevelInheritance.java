package com.cg.Inheritance;

	class Samsung
	{
		void accept()
		{
			System.out.println("Samsung Galaxy");
		}
	}
	class SamsungM31 extends Samsung
	{
		void print()
		{
			System.out.println("Samsung Galaxy-M31");
		}
	}
	class SamsungM31s extends SamsungM31
	{
		void display()
		{
			System.out.println("Samsung Galaxy-M31s");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungM31s obj=new SamsungM31s();
		obj.display();
		obj.accept();
		obj.print();
	}

}
