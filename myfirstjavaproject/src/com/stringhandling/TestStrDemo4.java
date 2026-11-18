package com.stringhandling;

public class TestStrDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		char data[]= {'a','b','c'};
		String str=new String(data);//abc
		System.out.println(str);
		
		String s=new String();
		System.out.println(s);//empty character
		
		String s1=new String("Java");
		String s2="Java";
		
		
		System.out.println("main method ended");

	}

}
