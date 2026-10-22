package com.languagefundamentals_1.constructors;
import java.util.Scanner;
public class Student {

	int id;
	String name;
	
	//no arg constructor
//java compiler is creating default constructor then why no arg 
//constructor in java..?
// ans i)when the class contains, parameterized constructors,
// then java compiler will not create default constructor.	
// ii)if we want to initialize the data instead of JVM 
//initializing the default data . 	
	
	Student(){
		System.out.println("no arg constructor called");
		id=100;
		name="unknown";
	}
	
	// parameterized constructors
// why we need to use this keyword in constructors...?
	Student(int i, String n){
		System.out.println("Parameterized constructor called");
		id=i;
		name=n;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		
//The below object is created with the help of default constructor when 
	//we dont have any constructors.
		
//the below object is created with the help of no arg constructor
		Student s1= new Student();
		s1.show();
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		//Student s2=new Student();
		//s2.id=3;
		//s2.name="raina";
		//System.out.println(s2.id);
		//System.out.println(s2.name);
		
		Student s3=new Student(18, "virat");
		s3.show();
		
		Student s4=new Student(45,"rohit");
		s4.show();
		
		System.out.println("main method ended");
		
	}
	
	void show() {
		System.out.println("****************************");
		System.out.println("show method called");
		System.out.println(id);
		System.out.println(name);
		System.out.println("****************************");
	}

}
