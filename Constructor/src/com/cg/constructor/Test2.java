package com.cg.constructor;

public class Test2 {
	int id;
	String name;
	String city;
	public Test2(int userId,String userName,String userCity) {
		id=userId;
		name=userName;
		city=userCity;
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("city="+city);
		
		
	}
	public static void main(String args[])
	{
		Test2 test=new Test2(11,"Pratiksha","Amaravati");
	}
}
