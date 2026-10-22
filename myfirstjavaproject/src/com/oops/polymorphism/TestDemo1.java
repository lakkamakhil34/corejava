package com.oops.polymorphism;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		byte b=10;
		
		System.out.println(b);//Auto promotion
		
		Integer i=100;
		System.out.println(i);//Auto Unboxing
		TestDemo1 t=new TestDemo1();
		
		//int long float double
		System.out.println(100);
		System.out.println(98988918719L);
		System.out.println(5.9F);
		System.out.println(75.5D);
		
		//char[] char object boolean
		char[]ch= {'a','p','p'};
		System.out.println('c');
		System.out.println(ch);
		
		System.out.println(t);
		System.out.println(false);

	}

}
