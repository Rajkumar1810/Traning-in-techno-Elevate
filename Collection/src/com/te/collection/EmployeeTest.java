package com.te.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest  {
	
	
	public static void main(String[] args) {

		
        Employee employee = new Employee (10, "Raj");
        Employee employee1 = new Employee (20, "kumar");
        Employee employee2 = new Employee (30, "yamini");
        
        ArrayList<Employee> arrayList=new ArrayList<Employee>();
        arrayList.add(employee);
        arrayList.add(employee1);
        arrayList.add(employee2);
        
        System.out.println("Before Sorting");
        for (Employee employee3 : arrayList) {
        	System.out.println(employee3);
			
		}
        
        System.out.println("usingComparble");
        Collections.sort(arrayList );
        for (Employee employee3 : arrayList) {
        	System.out.println(employee3);
			
		}
        System.out.println("After Sorting");
        Collections.sort(arrayList, new  EmployeeCompareTest() );
        for (Employee employee3 : arrayList) {
        	System.out.println(employee3);
			
		}
        
        System.out.println("After Sorting");
        Collections.sort(arrayList, new  EmployeeName() );
        for (Employee employee3 : arrayList) {
        	System.out.println(employee3);
			
		}


        
	}

}
