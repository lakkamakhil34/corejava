package com.oops.abstraction;

public class Cat implements Animal {
	

	@Override
	public void sound() {
		System.out.println("Cat sounds as meow meow!!");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat eats rats");
		
	}

	@Override
	public void walk() {
		System.out.println("Cat walk came from cat only");
		
	}
	
	public void run() {
		System.out.println("Cat can run");
	}


}
