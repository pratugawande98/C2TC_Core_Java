package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class ReadLineByLine {
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis=null;
		Scanner sc=null;
		
		try
		{
			 fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\javaIO.txt");
			 sc=new Scanner(fis);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			
			fis.close();
	        sc.close();
	        System.out.println("Successfull");
		}
}
}