package com.te.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ProgramaList {
 
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(20);
	    arrayList.add(20);
	    arrayList.add(30);
	    arrayList.add(40);
	    arrayList.add(50);
	    
	    System.out.println(arrayList);
	    
	    System.out.println("************************************");
	    
	    for (int i = 0; i <arrayList.size(); i++) {
			
	    	System.out.println(arrayList.get(i));
		}
			
	    System.out.println("************************************");
	    for (Object object : arrayList) {
	      System.out.println( object);
			
		}
	    
	    
		}
	    
	    	
}

