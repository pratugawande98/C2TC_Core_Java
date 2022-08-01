package com.cg.lambdaexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example7 {
	public static void main(String [] args) {
List<Integer> l=List.of(10,12,13,45,32,0,56,78,98,34,67,31);
System.out.println(l);
Stream<Integer> stream=l.stream();
List<Integer> el= stream.filter(i->i%2==0).collect(Collectors.toList));
System.out.println(el);

}
}
