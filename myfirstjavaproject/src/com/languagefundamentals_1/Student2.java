package com.languagefundamentals_1;

import java.text.CollationElementIterator;


public class Student2 {
	
	static int collegeId=777;
	static String collegeName="Vcube";

	public static void main(String[] args) {
		//local+primitive
		int a=100;
		
//the local variable a may not have been initialized
//JVM does not provide default values for local varables,
// we must need to initialize. 		
		System.out.println(a);
		
		int collegeId=879;
		String collegeName="vss";
				
		System.out.println(collegeId);
		System.out.println(collegeName);
		
		System.out.println(Student2.collegeId);
		System.out.println(Student2.collegeName);
		
		System.out.println(Student1.instituteId);
		System.out.println(Student1.instituteName);

	}

}
