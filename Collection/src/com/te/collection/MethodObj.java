package com.te.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class MethodObj implements Iterable{
   
	private  Object []array;
	private  int position;
	
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
	
	
	@Override
	public String toString() {
		if (size()==0) {
			return"[]";
		}
		String string="["+array[0];
		for (int i = 1; i <size(); i++) {
			string +=","+ array[i];
			
		}
		string +="]";
//		System.out.println("given the null value");
//		String string1="["+array[0];
//		for (int i = 1; i <array.length; i++) {
//			string1 +=","+ array[i];
//			
//		}
//		string1 +="]";
	    		return string;
	}
	@Override
	public Iterator iterator() {
		
		return new MyItr();
	}

	private class MyItr implements Iterator {
      
		private  int index;
      	@Override
		public boolean hasNext() {
			
      		return (index<position)? true :false;
      	}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return array[index++];
		}
		
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
		
		System.out.println("------------------");
		
		System.out.println(methodobj.toString());
		System.out.println("------------------");
		System.out.println(methodobj.size());
		System.out.println("------------------");
	    for (int i = 0; i < methodobj.size(); i++) {
	    	System.out.println(methodobj.get(i));
			
		}
	    System.out.println("------------------");
	  
	    for (Object object : methodobj) {
	    	System.out.println(object);
		}
	    System.out.println("------------------");
	    Iterator iterator=methodobj.iterator();
	  while(iterator.hasNext()) {
		  System.out.println(iterator.next());
	  }
		}
	  
	    
	    
	    
	}
	

	

	
	
	
	

