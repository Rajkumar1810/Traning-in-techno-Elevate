package com.te.collection;

import java.util.ArrayList;

public class MethodObj {
   
	private  Object []array;
	private int position;
	
	public MethodObj( int arraysize) {
		
		this.array = new Object[arraysize];
	
	}

	public void add(Object element) {
	   if (this.position>=this.array.length) {
		   growArray();
		
	}
		this.array[position++] = element;
	
	}
    	
	public Object  get(int index) {
		
		return this .array [index];
		
	} 
	private int size() {
		// TODO Auto-generated method stub
        return this.position;
	}
	private void growArray() {
		Object[] temp= new Object[this.array.length +5];
		System.arraycopy(this.array, 0, temp, 0, this.array.length);
		array=temp;
		
	}
	public static void main(String[] args) {
		MethodObj methodobj=new MethodObj(10 );
		
		methodobj.add(10);
		methodobj.add(20);
		methodobj.add(30);
		methodobj.add(40);
		methodobj.add(50);
		methodobj.add(60);
		methodobj.add(70);
		methodobj.add(80);
		methodobj.add(90);
		methodobj.add(100);
		methodobj.add(110);
		System.out.println(methodobj.size());
		System.out.println("------------------");
	    for (int i = 0; i < methodobj.size(); i++) {
	    	System.out.println(methodobj.get(i));
			
		}
	    
	}
	
	
	
}
