package com.operators;

import java.util.Scanner;

public class SwappAssign {
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A value:");
		int A=sc.nextInt();
		
		System.out.println("Enter B value:");
		int B=sc.nextInt();
		
		System.out.println("//Before swapping//");
		System.out.println("A="+A);
		System.out.println("B="+B);
		
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println("///After swapping//");
		System.out.println("A="+A);
		System.out.println("B="+B);



	}

}
