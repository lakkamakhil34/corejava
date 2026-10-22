package com.logicalstatements;

import java.util.Scanner;
//WAP to find the grade on students marks percentage?


public class TestLSDemo2 {

	static String gradeInfo(double marksP) {
		String grade=" ";
		
		if(marksP>100 || marksP<0) {
			System.out.println("Invalid Marks Percentage:");
		
			
			
		}else if(marksP>=90) {
			grade="Excellent-A";	
		}else if(marksP>=80) {
			grade="Good-B";
		}else if(marksP>=70) {
			grade="Avg-C";	
		}else if(marksP>=60) {
			grade= "ok-D";
		}else if(marksP>=35) {
			grade="Just passed P";
		}else {
			grade="Failed-F";
		}
		
		return grade;
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks percentage%:");
		double marksP=sc.nextDouble();
		
		String grade=gradeInfo(marksP);
		System.out.println("Student Grade based on his marks P:"+grade);
		
		
		
		System.out.println("main method ended");
 

	}

}
