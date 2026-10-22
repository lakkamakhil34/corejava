package com.oops.abstraction;

public class Dog implements Animal {
	
	@Override
	public void sound() {
		System.out.println("Dog sounds like Bow Bow !!");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog eats mostly Non-Veg!!");
	}
	
	@Override
	public void walk() {
		System.out.println("Dog can walk and run like anything!!");
	}
	
	@Override
	public void run() {
		System.out.println("Dog can run");
	}

	@Override
	public void sleep() {
		System.out.println("Dog sleeps in the morning");
	}

	
	

}
