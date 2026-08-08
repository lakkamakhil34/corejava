package com.logicalstatements.loops;

import java.util.Scanner;

//WAp to find the given number is perfect or not?
//input number=6
//perfect=sum of its factor=given number
//output should =true
public class TestLPDemo4 {

	void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to find factors:");
		int n=sc.nextInt();
		boolean status=isPerfect(n);
		
		if(status) {
			System.out.println("The given number is Perfect");
		}else {
			System.out.println("the given number is not perfect");
		}

		
	}
	boolean isPerfect(int n) {
		boolean flag=false;
		int sum=0;
		
		for (int i=1; i<=n/2; i++) {
			if(n%i==0) {
				sum=sum + i;
			}
			if (sum==n) {
				flag=true;
			}
		}
		
		return flag;
	}

}
