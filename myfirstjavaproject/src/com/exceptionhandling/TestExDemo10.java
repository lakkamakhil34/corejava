package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		try {
			System.out.println("in try");
			System.out.println(100/n);
		}catch(Exception e) {
			System.err.println("in catch");
		}finally {
			System.out.println("in finally");
			sc.close();
		}
		
		System.out.println("main method ended");

	}

}
