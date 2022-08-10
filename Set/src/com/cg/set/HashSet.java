package com.cg.set;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		
		//Duplicate elements not allowed
		hs.add("B");
		hs.add("A");
		
		
		hs.add(null);
		System.out.println(hs);
		
		hs.remove("E");
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
	}

}