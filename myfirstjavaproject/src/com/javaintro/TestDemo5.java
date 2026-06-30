package com.javaintro;

public class TestDemo5 {
	
	native void hello();

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		System.out.println(10/0);
		
		
		TestDemo5 t= new TestDemo5();
		
	}

}
