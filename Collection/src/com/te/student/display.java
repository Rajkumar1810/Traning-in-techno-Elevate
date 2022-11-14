package com.te.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class display {
	static String a="yes" ;
	static String y2;
	static Scanner s=new Scanner(System.in);
	public static void input() {
		
		
		Set<StudentUserInput> set = new HashSet<StudentUserInput>();
	    
		do {
		System.out.println("Welcome The Govt Hr Sec School");
//		System.out.println("Enter the Data");
		System.out.println("Enter the StudentId ");
		 int id =s.nextInt();
		System.out.println("Enter the Student Name");
		 String name=s.next();
		System.out.println("Enter the StudentAge ");
		int age =s.nextInt();
		System.out.println("Enter the StudentMark ");
	    int marks =s.nextInt();
	     
//		StudentUserInput studentUserInput = ;
	  
	    set.add(new StudentUserInput(id, name, age, marks));
	    System.out.println("If you want continonue\n 1.Yes\n2.no");
	    y2= s.next();
	}while(a.equals(y2));
//		StudentUserInput studentUserInput = new StudentUserInput(id, name, age, marks);
//	    System.out.println(studentUserInput);
		System.out.println("Thanking you");
	   ArrayList<StudentUserInput> arrayList = new ArrayList<StudentUserInput>(set);
	   Collections.sort(arrayList,new ComStudent () );
		for (StudentUserInput studentUserInput : set) {
			System.out.println(studentUserInput);
		}
}
}
