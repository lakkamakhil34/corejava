package com.exceptionhandling;

//the try block code always as less as possible.
public class TestExDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println("in try");
			System.out.println(10/0);
			System.out.println("hello");
			System.out.println("good evening");
		}catch(Exception e) {
			System.err.println("in catch");
		}
		
		
		
		System.out.println("main method e");

	}

}
