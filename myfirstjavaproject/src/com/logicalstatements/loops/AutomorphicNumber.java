package com.logicalstatements.loops;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		
		int square=n*n;
		int temp=n;
		int divisor=1;
		
		while(temp>0) {
			divisor=divisor*10;
			temp=temp/10;
		}
		if(square%divisor==n) {
			System.out.println("Automorphic number");
		}else {
			System.out.println("Not an Automorphic number");
		}

	}

}
