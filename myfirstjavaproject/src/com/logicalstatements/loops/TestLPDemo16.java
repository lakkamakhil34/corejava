package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print the given number is armstrong or not? 
public class TestLPDemo16 {
	
	
	boolean isArmstrong(int n) {
		boolean status=false;
		
		int temp=n;
		int r=0;
		int sumP=0;
		
		String digits=Integer.toString(n);
		int digitCount=digits.length();
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sumP=sumP+r*r*r;
			//sumP=(int)(sumP+Math.pow(r, digitCount));
		}
		if(sumP==temp) {
			status=true;
		}
		return status;
	}

	void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();

		boolean status=isArmstrong(n);
		
		if (status) {
			System.out.println("The given number is Armstrong");
		}else {
			System.out.println("The given number is not a Armstrong");
		}
	}

}
