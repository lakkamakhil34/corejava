package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo14 {

	//input=343
	static boolean isPalin(int n) {
		boolean status=false;
		int temp=n;//343
		int r=0;
		int rev=0;
		
		while (n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		return status;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		boolean status= isPalin(n);
		
		if(status) {
			System.out.println("The given number is Palindrome");
		}else {
			System.out.println("The given number is not a Palindrome");
		}



	}

}
