package com.javaintro;


public class Employeek {
	
	
 @Override
protected void finalize() {
   System.out.println("Object Destroyed");
	 
 
 }


	public static void main(String[] args) {
		
		Employeek a= new Employeek();
		System.out.println(a);
		
		Employeek b= new Employeek();
		System.out.println(b);
		
		a=null;
		
		
		System.gc();
		System.out.println("---------------------------");
		System.out.println(a);
		System.out.println(b);

	}

}
