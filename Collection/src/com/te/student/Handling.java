package com.te.student;

public class Handling extends RuntimeException {
	String message;

	public Handling(String message) {
//		super(message);
		this.message=message;

	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Enter  The Proper Number Request";
	}
	
	

}
