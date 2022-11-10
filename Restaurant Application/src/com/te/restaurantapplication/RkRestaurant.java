package com.te.restaurantapplication;

import java.util.*;

public class RkRestaurant {
	static int sum = 0;
	static int sum1 = 0;
	static int sum2 = 0;
	static int sum3 = 0;
	static int sum4 = 0;
	static int bill = 0;
	static String ch;
	static Scanner s = new Scanner(System.in);
	static int order;
	static boolean repeate = true;

	public static void furtherassistance() {
		System.out.println("if you  want to contiune  yes or no");
		ch = s.next();
		if (ch.equals("yes")) {
			System.out.println("Enter the order number: ");
			int order1 = s.nextInt();
			order1 = order;
		} else if (ch.equals("no")) {
			repeate = false;

		}
	}

	public static void main(String[] arg) {

		System.out.println("\tWelcome to Rk Restaurant\n");

		String menu[] = { "1.Grill Chicken   ", "2.Mutton Briyani  ", "3.Chicken Briyaani  ", "4.Fish Briyaani   ","5.Exit             " };
		int rate[] = { 250, 260, 180, 388,0 };
		System.out.println("\tMenu" + "\t\t\tRate \n");

		for (int i = 0; i < 5; i++) {
			System.out.println(menu[i] + "\t\t" + rate[i]);

		}

		System.out.println("\n");
		do {
			System.out.println("Enter the order number: ");
			 int order = s.nextInt();
		try {
			 if (order>=5);
		}
		catch (HandlingExpection e)  {
			// TODO: handle exception
		
		System.out.println(e.getMessage());
		}
			
			 
			 
				 switch (order) {

			case (1): {
				System.out.println("Your Order for Grill chicken");
//			System.out.println("1.Full Grill Chicken Plate -Rs.250");

				System.out.println("How many plate for order: ");
				int qyt = s.nextInt();
				if (qyt != 0) {
					sum = +qyt * rate[0];
					sum1 = sum;
					System.out.println("Bill amount of your order:  " + sum1);
				}
				furtherassistance();
				break;
			}
			case (2): {
				System.out.println("Your Order for Mutton Briyani");
				System.out.println("How many plate for order: ");
				int qyt = s.nextInt();
				if (qyt != 0) {
					sum = +qyt * rate[1];
					sum2 = sum;
					System.out.println("Bill amount of your order: " + sum2);
				}
				furtherassistance();

				break;
			}
			case (3): {
				System.out.println("Your Order for Chicken Briyani");
				System.out.println("How many plate for order: ");
				int qyt = s.nextInt();
				if (qyt != 0) {
					sum = +qyt * rate[2];
					sum3 = sum;
					System.out.println("Bill amount of your order: " + sum3);
				}
				furtherassistance();
				break;
			}
			case (4): {
				System.out.println("Your Order for Fish Briyani");
				System.out.println("How many plate for order: ");
				int qyt = s.nextInt();
				if (qyt != 0) {
					sum = +qyt * rate[3];
					sum4 = sum;
					System.out.println("Bill amount of your order: " + sum4);
				}
				furtherassistance();

				break;
			}
			case(5):{
				repeate= false;
				break;
			}
			default: {
			
			throw new HandlingExpection("Enter the proper number");
			
			  
			}
			}

			

		} while (repeate);
		bill = sum1 + sum2 + sum3 + sum4;
		System.out.println("Your is Total bill amount:  " + bill);
		System.out.println("Thank you for ordering");

	}
}