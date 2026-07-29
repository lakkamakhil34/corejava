package com.languagefundamentals_1.methods;

import java.util.Scanner;

public class StudentResult {
	
	void displayStudent(String name) {
		System.out.println("Student name:"+name);
		
	}
	
	void calculateTotal(int m1, int m2, int m3) {
		int total= m1+m2+m3;
		System.out.println("Total marks:"+total);
	}
	
	void calculateAverage(int m1, int m2,int m3) {
		double average=(m1=m2=m3)/3;
		System.out.println("Average marks:"+average);
	}

	
	
	void main(String[] args) {
		System.out.println("main method started");
		Scanner sc= new Scanner(System.in);
		StudentResult s= new StudentResult();
		
		System.out.println("Enter the student name:");
		String name=sc.nextLine();
		
		System.out.println("Marks in m1:");
		int m1=sc.nextInt();
		
		System.out.println("Marks in m2:");
		int m2=sc.nextInt();
		
		System.out.println("Marks in m3:");
		int m3=sc.nextInt();
		
		System.out.println("Average marks:");
		double average=sc.nextDouble();
		
	
		displayStudent(name);
		calculateTotal(m1,m2,m3);
		calculateAverage(m1,m2,m3);
		
		System.out.println("main method ended");

	}

}
