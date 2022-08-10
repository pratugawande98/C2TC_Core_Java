package com.test.method;

public class Test {
	

	//Design method which return student name
	String getStudentName(String name) { //Pratiksha is store into name
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test test=new Test();
String S=test.getStudentName("Pratiksha");//calling of method
System.out.println("Student name is:"+S);
	
	}
}
