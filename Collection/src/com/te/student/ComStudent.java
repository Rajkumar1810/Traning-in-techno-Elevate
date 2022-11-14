package com.te.student;

import java.util.Comparator;

import com.te.collection.Employee;

public class ComStudent  implements Comparator<StudentUserInput>  {

	@Override
	public int compare(StudentUserInput o1, StudentUserInput o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}

	
}
