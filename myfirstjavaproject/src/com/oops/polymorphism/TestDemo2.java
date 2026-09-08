package com.oops.polymorphism;

public class TestDemo2 {

	void main(String[] args) {
		System.out.println("main method started");
		addition(1,1);
		addition(30,5);
		addition(10,35);
		addition(10,10);
		
		
		

	}
	
	void addition(int a, int b) {
		System.out.println("int two addition method called ");
	}
	void addition(int a,float b) {
		System.out.println("int-float addition method called ");
	}
	void addition(float a, int b) {
		System.out.println("float-int addition method called " );
	}

	void addition(float a,float b) {
		System.out.println("float two addition method called ");
	}



}
