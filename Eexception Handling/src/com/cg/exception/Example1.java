package com.cg.exception;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x=12/0;
			System.out.println(x);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled " +e);
		}
	}

}
