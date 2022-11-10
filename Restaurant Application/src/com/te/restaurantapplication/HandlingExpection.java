package com.te.restaurantapplication;

public class HandlingExpection extends RuntimeException {
	
	String message;

	public HandlingExpection(String message) {
//		super(message);
		this.message=message;

	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Enter  the proper number";
	}
	
	
	

}
