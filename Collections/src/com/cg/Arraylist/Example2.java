package com.cg.Arraylist;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<Integer>();
		System.out.println(l.isEmpty());
		l.add(1);
		l.add(3);
		l.add(5);
		l.add(12);
		l.add(1);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains(15));
		System.out.println(l.indexOf(1));
		System.out.println(l.lastIndexOf(1));
		System.out.println(l.get(2));
		l.set(4, 23);
		System.out.println(l);
		System.out.println(l.isEmpty());
	}

}
