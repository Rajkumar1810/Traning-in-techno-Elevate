package com.te.student;

public class Student implements Comparable<Student> {
	
	int studentId ;
	String studentName;
	int studentAge; 
	int studentMarks;
	
	public Student(int studentId, String studentName, int studentAge, int studentMarks) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentMarks=" + studentMarks + "]";
	}

	@Override
	public int compareTo(Student o) {
		// why if give Age compare getting error
		return o.studentName.compareTo(this.studentName) ;
		 
	} 
	
	
	

}
