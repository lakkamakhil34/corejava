package com.logicalstatements.loops;

import java.util.Scanner;

//Q)WAP to print the digit count of a given number
public class TestLPDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int count=0;
		
		while(n>0) {
			n=n/10;//123/10-->12-->1-->0
			count++;
		}

		System.out.println("The count is:"+count);

	}

}
