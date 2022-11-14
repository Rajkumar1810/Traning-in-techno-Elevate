package com.te.student;


import java.util.Scanner;

public class StudentUserInput {

	 int id ;
	 String name;
	 int age; 
	 int marks;
	
	
	@Override
	public String toString() {
		return " ["+"StudentID :"+id+" "+"StudentName : "+name+" "+"StudentAge: "+age+" "+"StudentMarks :"+marks +"]";
	}
	
	public StudentUserInput(int id, String name, int age, int marks) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
//	StudentUserInput studentUserInput = new StudentUserInput(id,);	
	System.out.println("You want to Enter the Data\n1.yes\n2.no");
	String y= s.next();
	String  z="yes";
//	String  y1="yes";
//	 String c=s.next();
//	y1=y;
	
	
	if (z.equals(y)) {
		 display .input();
		
	}
	else  {
		System.out.println("Thank you");
	}
	}

	@Override
	public int hashCode() {
		
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (id == this.id) {
			System.out.println("Enter the vaild id");
			return true;
		}
		return false;
	}
	

}
