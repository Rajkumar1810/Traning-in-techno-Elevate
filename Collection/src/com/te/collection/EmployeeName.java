package com.te.collection;

import java.util.Comparator;

public class EmployeeName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.empName.compareTo(o2.empName); 
	}
	

}
