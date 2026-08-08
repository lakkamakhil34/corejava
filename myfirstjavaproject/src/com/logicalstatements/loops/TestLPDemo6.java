package com.logicalstatements.loops;

import java.util.Scanner;

///Q)WAP to print factorial of a given number using for loop..?
/// input:4
/// output:24=4*3*2*1=24
public class TestLPDemo6 {

	void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int n1=findFactorial(n);
			System.out.println("Factorial of a given number :"+n1);
		
		
	}

	int findFactorial(int n) {
		int fact=1;
		///5-->fact=5*1=5
		///4-->fact=4*5=20
		///3-->fact=3*20=60
		///2-->fact=2*60=120
		///1-->fact=1*120=120   
		for(int i=n; i>=1;i--) {
			fact=i*fact;
		}
		return fact;
	}
	
}
