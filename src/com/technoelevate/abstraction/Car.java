package com.technoelevate.abstraction;

public interface Car {
	void accelerate();
	void brake();
	void gear();
	default void  ariBags() {
		
	}
	
	default void gps() {
		
	}
	default void engine() {
		
	}

}
