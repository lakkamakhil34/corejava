package com.logicalstatements.loops;

import java.util.Scanner;

///input:9
/// output:
/// 9x1=9
/// 9x2=18
/// 9x3=27
/// 9x4=36
/// 9x5=45
/// 9x6=54.......9x10=90

public class TestLPDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		System.out.println("How many times you want to print");
		int n1=sc.nextInt();
		
		for(int i=1;i <=n1;i++) {
			System.out.println(n + " X " +i+ " = " +(n*i));
		}
		
		

	}

}
