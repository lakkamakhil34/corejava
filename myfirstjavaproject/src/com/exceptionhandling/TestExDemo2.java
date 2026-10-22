package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {
		String s=null;
		String s1="null";
		String s2="";
		
		System.out.println(s2.length());//0
		System.out.println(s1.length());//4
		
		try {
			System.out.println(s.length());//NPE null dot anything is NPE
		}catch(NullPointerException ne) {
			ne.printStackTrace();
		}
		


		System.out.println("main method ended");

	}

}
