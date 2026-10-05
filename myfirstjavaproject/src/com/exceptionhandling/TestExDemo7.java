package com.exceptionhandling;

public class TestExDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		
		try {
			int x=100/2;
			String str= "Srikanth";
			System.out.println(str.charAt(x));
			
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println("in catch of se");
			
		}catch(ArithmeticException ae) {
			System.out.println("in catch ae");
			
		}catch(Exception e) {
			System.out.println("in catch e");
		}
		
		
		
		
		System.out.println("main method ended");

	}

}
