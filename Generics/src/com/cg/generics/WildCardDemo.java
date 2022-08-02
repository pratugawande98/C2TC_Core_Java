package com.cg.generics;

import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> List1 = Arrays.asList(14, 45, 78, 63, 89); 
		
		List<Double> List2 = Arrays.asList(2.3, 5.6, 8.9, 7.5);
		
		printList(List1);
		printList(List2);
		
	}
	
	public static void printList(List<?> List)
	{
		System.out.println(List);
	}


	}


