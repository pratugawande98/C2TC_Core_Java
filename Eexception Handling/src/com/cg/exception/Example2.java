package com.cg.exception;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First line");
        System.out.println("Second line");
        int[] myIntArray = new int[]{1, 2, 3};
        try
        {
        	print(myIntArray);
        	System.out.println("Third line");
        }
        catch(Exception e)
        {
        	System.out.println("Exception handled "+e);
        }
        finally
        {
        	
        	System.out.println("Finally Block");
        }
        
        System.out.println("Welcome to M20 Batch");
    } 
    public static void print(int[] arr) {
        System.out.println(arr[3]);
        System.out.println("Fourth element successfulli displayed.");
    
	}

}
