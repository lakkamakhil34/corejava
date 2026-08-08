package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo7 {

	void main(String[] args) {

		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int n1=fact(n);
		System.out.println("Factorial of given number:"+n1);
		
	}

	int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		///5*fact(4)
		/// 5*fact(4)
		/// 5*fact(4)
		/// 5*fact(4)
		/// 5*fact(4)
		/// _________________________________
		/// 2
		/// 6
		/// 24
		/// 120
		return n*fact(n-1);
	}
	
}
