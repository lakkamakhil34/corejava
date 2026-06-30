package com.javaintro;

public class Test3Demo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Test3Demo1 t= new Test3Demo1();
		hello();
		t.welcome();

	}
	
	
	public static void hello() {
		System.out.println("hello!! good morning");
	}

	void welcome() {
		System.out.println("welcome to Jave World");
	}
}
