package com.javaintro;

public class Employee {

	
	int eid;
	String name;
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		
		Employee e1= new Employee();
		Employee e2= new Employee();
		
		System.out.println(e1.eid);
		System.out.println(e1.name);
		
		System.out.println(e2.eid);
		System.out.println(e1.name);
	}

}
