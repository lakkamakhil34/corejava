package com.operators;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks:");
		int marks=sc.nextInt();
		
		String grade= (marks>=90)?"A":
			          (marks>=75)?"B":
			       	  (marks>=60)?"C":
			          (marks>=40)?"D":	
			          "Fail";
		System.out.println("Grade:"+grade);
		sc.close();
			        	  
			        	  

	}

}
