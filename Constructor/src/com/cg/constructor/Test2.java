package com.cg.constructor;

public class Test2 {
	int id;
	String name;
	String city;

	public Test2(int userId, String userName, String userCity) {
		id = userId;
		name = userName;
		city = userCity;
		System.out.println("id is:" + id);
		System.out.println("name is:" + name);
		System.out.println("city:" + city);
	}

	public static void main(String[] args) {

		Test2 test2 = new Test2(10, "ram", "pune");
	}

}




