package com.exceptionhandling;

public class TestExDemo6 {

	public static void main(String[] args) {


		System.out.println("main method started");
		try {
			System.out.println("in try");
			System.out.println(10/0);
			
			String s=null;
			System.out.println(s.length());
			
		}catch(ArithmeticException e) {
			System.err.println("in catch ae");
			
		}catch(NullPointerException e) {
			System.err.println("in catch of ne");
			
		}catch(Exception e) {
			System.err.println("in catchof e");
		}
		
System.out.println("main method ended");
	}

}
