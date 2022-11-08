package com.technoelevate.abstraction;

public class Driver {
	public static void main(String[] arg) {

//		Car audi=new Audi();
//		audi.accelerate();
//		audi.brake();
//		audi.gear();
//		
//		System.out.println("**************");
//		Car bmw=new Bmw();
//		bmw.accelerate();
//		bmw.brake();
//		bmw.gear();

		Car car = Carfactory.getCar();
		CarGetDetails carGetDetails = new CarGetDetails();
		carGetDetails.driver(car);
		// driver.drive(car);
	}

}

