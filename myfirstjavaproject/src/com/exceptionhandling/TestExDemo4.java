package com.exceptionhandling;

public class TestExDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println("in try!");
			System.out.println(10/0);
		}catch(NullPointerException e) {
			System.out.println("in catch");
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("in catch AE");
			e.printStackTrace();
		
		System.out.println("main method ended");
	}

}
