package com.javaintro;

public class Employee1 {
	
	static String companyName= "Vcube";
	static String location= "Hyderabad";
	
	int salary;
	String employeeName;
	
	

	public static void main(String[] args) {
		System.out.println("Life of an IT Employee");
		
		Employee1 e1= new Employee1();
				e1.employeeName= "A";
				e1.salary= 25000;
				
		System.out.println(e1.employeeName);
		System.out.println(companyName);
		System.out.println(location);
		System.out.println(e1.salary);
				
				
			
		
	}

}
