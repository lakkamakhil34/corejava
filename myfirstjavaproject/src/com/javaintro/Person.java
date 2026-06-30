package com.javaintro;

public class Person {

	
	
	int age;
	String CountryName;
	
	static int phoneNumber= 24678;
	static String place= "hyderabad";
	
	

	public static void main(String[] args) {
		System.out.println("Welcome to KIMS");
		
	
			
		
		System.out.println("object1 info");
		
		  Person p1= new Person();
		
		p1.age=23;
		p1.CountryName="India";
		
		
		
		
	    System.out.println("person1 age:"+p1.age);
		System.out.println("phone number:"+phoneNumber);
		System.out.println("place:"+place);
		System.out.println("country name:"+p1.CountryName);
	}
	
}
