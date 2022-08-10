package com.cg.assignment;

import java.util.Scanner;

public class GreaterNo {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num >100)
            System.out.println("Greater than 100");
        else
            System.out.println("Less than 100");
}

}
