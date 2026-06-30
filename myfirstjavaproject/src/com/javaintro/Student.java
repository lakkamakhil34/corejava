package com.javaintro;

public class Student {
//Declare
	//instance vari
	int sid;
	String sname;
	String saddress;
	int sage;
	
	//static variable
	static int collegeID;
	static String collegeName;
	static String address;
	static int age;
	
	
	public static void main(String[] args) {
	
		System.out.println("main method started");
		System.out.println("student information from Vcube started");

		
		// ACCESS
		//we cannot access instance data in static area directly.
		// if we want we have to create object
		
		
		//LHS= student class name& akhil is object
		//rhs= new is keyword to create object in java
		//    student () is constructor calling
		//constructor is for initializing the object in class.
		// == is assignment operator
		
		// INSTALLIZATION
		Student akhil = new Student(); // object creation
		
		collegeID = 7947;
	    collegeName = "Vcube";
	    address= "Hyderabad";
	    age= 24;
		
	    
	    System.out.println("collegeID:" + collegeID);
		System.out.println("collegeName:" + collegeName);
		System.out.println("address:"+ address);
		System.out.println("age:"+ age);
		
		// ACCESSS
		akhil.sid= 7879;
		akhil.sname= "Akhil";
		akhil.saddress= "Mumbai";
		akhil.sage= 22;
		
		System.out.println("akhil.sid:" + akhil.sid);
		System.out.println("akhil.sname:" + akhil.sname);
		System.out.println("akhil.saddress:" +akhil.saddress);
		System.out.println("akhil.sage:"+ akhil.sage);
		
	}

}
