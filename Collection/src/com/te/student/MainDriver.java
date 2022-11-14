package com.te.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//import com.te.restaurantapplication.HandlingExpection;

public class MainDriver {
	
	 static Scanner s= new Scanner(System.in);
     public static void main(String[] args) {
    	 
               Student student =new Student(1, "Yamini", 26, 65 );
               Student student1 =new Student(2, "Ramya", 21, 60 );
               Student studen2 =new Student(6, "Emath", 27, 80 );
               Student studen3 =new Student(4, "Siva", 21, 30 );
               Student studen4 =new Student(3, "Sathish", 23, 55);
               Student studen5 =new Student(5, "Raj", 27, 7 );
               Student studen6 =new Student(7, "Raj", 28, 7 );
//               Student studen7 =new Student(7, "Ra", 28, 7 );

               
               
               ArrayList<Student> arrayList = new ArrayList<Student>();
               arrayList.add(student);
               arrayList.add(student1);
               arrayList.add(studen2);
               arrayList.add(studen3);
               arrayList.add(studen4);
               arrayList.add(studen5);

//               System.out.println(" Without sorting");
//               for (Student student6 : arrayList) {
//            	   System.out.println(student6);
//               }
               boolean rep=true;
               System.out.println("Using the sorting with and without.\n1.WithoutSorting\n2.Using Compareable\n3.Using Id\n4.Using Name\n5.Age\n6.Marks.\n7.Exit");
            	do { 
            	System.out.println("");
               System.out.println("Enter the number : ");
            	   int request =s.nextInt();
            	   try {
          			 if (request>=7);
          		}
          		catch (Handling e)  {
          			// TODO: handle exception
          		
          		System.out.println(e.getMessage());
          		}
            	   switch (request) {
			    	case 1:{
			    		   System.out.println(" Without sorting");
		               for (Student student6 : arrayList) {
			            	   System.out.println(student6);
		               }
					break;
				       }
			    	case 2:{
			    		   System.out.println(" Using compareable ording desc order");
			    		   Collections.sort(arrayList);
		                   for (Student student6 : arrayList) {
			            	System.out.println(student6);
		                   }
					       break;
				       }
			    	case 3:{
			    		   System.out.println(" Using Comparator IdStudent");
			    		   Collections.sort(arrayList,new IdStudent());
		                   for (Student student6 : arrayList) {
			            	System.out.println(student6);
		                   }
					       break;
				       }     
			    	case 4:{
			    		   System.out.println(" Using Comparator Name");
			    		   Collections.sort(arrayList,new Name());
		                   for (Student student6 : arrayList) {
			            	System.out.println(student6);
		                   }
					       break;
				       }   
			    	case 5:{
			    		   System.out.println(" Using Comparator Age");
			    		   Collections.sort(arrayList,new Age());
		                   for (Student student6 : arrayList) {
			            	System.out.println(student6);
		                   }
					       break;
				       }  
			    	case 6:{
			    		   System.out.println(" Using Comparator Mark");
			    		   Collections.sort(arrayList,new Mark());
		                   for (Student student6 : arrayList) {
			            	System.out.println(student6);
		                   }
					       break;
				       }  
			    	case 7:{
			    		System.out.println("Thankyou for visting");
			    		rep=false;
			    		
			    	}
				
				}
     }while(rep);
            	   
            	   
            	    
            	   
			}
               
               
               
	

    }
     
     
