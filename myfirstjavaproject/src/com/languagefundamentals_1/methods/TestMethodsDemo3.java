package com.languagefundamentals_1.methods;

// no return type+ with arguments
public class TestMethodsDemo3 {

	void main(String[] args) {
		System.out.println("main method started");
		
		// calling no argument method
		show();
		
		//calling by value
		show("Java");
		show("Vcube");
		show("Akhil");
		
		System.out.println("main method ended");
		
	}
	
	void show() {
		System.out.println("Good morning!!");
	}
	void show(String name) {
		System.out.println(name);
		
	}

}
