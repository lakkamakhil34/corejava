package com.oops.abstraction;

public class Monkey implements Animal {

	@Override
	public void sound() {
		System.out.println("Monkey makes sound as kichkichhhhhhhh");
	}

	@Override
	public void eat() {
		System.out.println("Monkey eats bananas");
		
	}

	@Override
	public void walk() {
		System.out.println("Monkey jumps");
		
	}
	
	public void run() {
		System.out.println("Monkey can run");
	}


}
