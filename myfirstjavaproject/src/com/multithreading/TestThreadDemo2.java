package com.multithreading;

public class TestThreadDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		TestThreadDemo2 t=new TestThreadDemo2();
		t.hello();
		
		for(int i=0;i<=10;i++) {
			System.out.println("main :" + i);
		}
		
		System.out.println("main method ended");

	}

	void hello() {
		System.out.println("Hello main method called");
		
		for(int i=0;i<=10;i++) {
			System.out.println("hello :" + i);
		}
		System.out.println("Hello method calledoff");
	}
}
