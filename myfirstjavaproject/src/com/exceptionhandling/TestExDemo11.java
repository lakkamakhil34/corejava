package com.exceptionhandling;

public class TestExDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(hello());
		
		System.out.println("main method ended");

	}
	 static int hello() {
		try {
			System.out.println("in try");
			return 10;
		}catch(Exception e) {
			return 20;
		}finally {
			return 30;
		}
	}

}
