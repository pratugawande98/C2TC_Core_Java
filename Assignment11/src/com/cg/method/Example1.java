/**
 * 
 */
package com.cg.method;

/**
 * @author Admin
 *
 */
public class Example1 {

	public static void test() {
		//printing statement
		System.out.println("This is static Method"); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example1.test(); //by using class name

Example1 obj=new Example1(); //by using new keyword

obj.test(); //by using object
	}

}
