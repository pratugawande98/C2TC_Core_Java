package com.cg.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
public int compare(Employee emp1,Employee emp2) {
	String emp1Name = ((Employee) emp1).getName();
	String emp2Name = ((Employee) emp2).getName();
//comparing Strings
	return emp1Name.compareTo(emp2Name);
	

}
}