package com.logicalstatements.loops;

import java.util.Scanner;

//factors of a number are whole numbers
//that divide the number exactly without leaving a remainder.
///WAP to print factors or divisors of a given number?
//input is number-->6
//output is numbers-->1 2 3=6-->perfect number 

//input-->24
//output-->1 2 3 4 6 8 12 24
//input-->28
//output-->1 2 3 4 7 14 =28-->perfect number
public class TestLPDemo3 {
	
	static void findfactors(int n) {
		for(int i=1; i<=n/2; i++) {
			if(n % i==0) {
				System.out.println(i +"");
			}
			
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find factors:");
		int n=sc.nextInt();
		findfactors(n);
		
		System.out.println("main method ended");

	}

}
