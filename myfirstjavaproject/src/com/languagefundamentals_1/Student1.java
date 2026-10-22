package com.languagefundamentals_1;

public class Student1{

// instance+primitive variable
	int id1=10;
	
//instance+ object variable	
	String name1= "vcube";
	
//	static+primitive variable
	static int instituteId=333;
	
//ststic+object variable	
	static String instituteName="Vcube";
	
	
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Student1 s1=new Student1();
		
		
		System.out.println("*****Accessing static data directly*****");
		System.out.println(instituteId);
		System.out.println(instituteName);
		
		System.out.println("***Accessing static data by using class name***");
		System.out.println(Student1.instituteId);
		System.out.println(Student1.instituteName);
		
		System.out.println("**Accessing instance data using object reference variable** ");
		System.out.println(s1.instituteId);
		System.out.println(s1.instituteName);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		
		Student1 s2=null;
		System.out.println("Accessing static data by using object reference variable");
//the static field Student1.instituteId should be accessed in static way		
		System.out.println(s2.instituteId);
		System.out.println(s2.instituteName);
		
//RE:cannot read field "id1" because "s2" is null		
		System.out.println(s2.id1);//NPE:NullPointerException
		System.out.println(s2.name1);
		
		System.out.println("main method ended");
		

	}

}
