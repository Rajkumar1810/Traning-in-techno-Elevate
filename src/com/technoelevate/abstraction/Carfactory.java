package com.technoelevate.abstraction;

import java.util.*;

public class Carfactory {

	public static Car getCar() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Car Name");
		String  carName= s.next();
		if( carName.equalsIgnoreCase("audi")) {
			return new Audi();
		}
		else if (carName.equalsIgnoreCase("Bmw")) {
			return new Bmw();
				
		}
		else {
			throw new RuntimeException("Invaild Car");
			
		}
		
		
		
		

	}

}
