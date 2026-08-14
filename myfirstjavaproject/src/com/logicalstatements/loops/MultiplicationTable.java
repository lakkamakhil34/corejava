package com.logicalstatements.loops;

import java.util.Scanner;

public class MultiplicationTable {

	
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		for(int i=0; i<=10;i++) {
			System.out.println(n+"X"+i+"="+(n*i));
		}
	}
}
