package com.technoelevate.abstraction;

public class Bmw implements Car {

	public void accelerate() {
		System.out.println("i'm now Acclerating ");
	}

	public void brake() {
		System.out.println("i'm now Brake  and stopping the car");
	}

	public void gear() {
		System.out.println("I'm now changing  the gear 4TH to 5TH");
	}
	@Override
	public void ariBags() {
		// TODO Auto-generated method stub
		System.out.println("In my car have Airbag feature add");
	}

}
