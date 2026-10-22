package com.logicalstatements;

import java.util.Scanner;

//WAP to print grade based marks percentage
//switch can return values
public class TestLSDemo {
	
	static String findGradeInfo(double marksP) {
		
		int m=(int)(marksP/10);
		String grade="";
		
		grade=switch(m) {
		
		case 9 ->{
			yield "A";
		}
		case 8 ->{
			yield "B";
		}
		case 7 ->{
			yield "C";
		}
		case 6 ->{
			yield "D";
		}
		case 5,4 ->{
			yield "P";
		}
		default->{
			yield "F";
		}
		
		};
		return grade;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks %");
		double marksP=sc.nextDouble();
		
		String grade=findGradeInfo(marksP);
		System.out.println("Student's grade is:"+grade);
 
		
		
	}

}
