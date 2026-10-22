package com.exceptionhandling;

public class TestExDemo9 {

	public static void main(String[] args) {

		System.out.println("main method started");

		//System.out.println(10/0);//A.E
		System.out.println(10/0.0);//infinity
		System.out.println(10.0/0);//infinity
		System.out.println(0.0/0.0);//NaN
		System.out.println(0/0.0);//NaN

		
		System.out.println("main method ended");

	}

}
