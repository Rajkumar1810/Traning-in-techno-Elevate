package com.te.javabasic.accessmodifer;

public class AccessModifer {
	
		
		public static void m1() {
			System.out.println("I'm Public");
		}
		protected static void m2() {
			System.out.println("I'm Proctected");
		}
		private static void m3() {
			System.out.println("I'm Private");
		}
	     static void m4() {
	    	System.out.println("I'm Default");
	    }
	    
	    public static void main(String[]arg) {
	    	AccessModifer.m1();
	    	AccessModifer.m2();
	    	AccessModifer.m3();
	    	AccessModifer.m4();
	    	
	    }
		
	

}
