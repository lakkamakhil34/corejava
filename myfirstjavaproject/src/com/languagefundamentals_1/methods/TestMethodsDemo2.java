package com.languagefundamentals_1.methods;

public class TestMethodsDemo2 {

	void main(String[] args) {
		System.out.println("main method started");
		addition();
		subtraction();
		multiplication();
		divison();
		
		
	}
	
	void addition() {
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
	}
 
	void subtraction() {
		int a= 30;
		int b=40;
		int diff= a-b;
		System.out.println(diff);
	}
	
	void multiplication() {
		int a=50;
		int b=5;
		int multiply=a*b;
		System.out.println(multiply);
	}
	
	void divison() {
		int a=200;
		int b=10;
	 System.out.println(a/b);
	}
	
	
}
