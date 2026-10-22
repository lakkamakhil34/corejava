package com.oops.abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("Welcome to Animal Park!!");
		
//		Animal a= new Animal();
//		Cannot instantiate the type Animal
		
//Dog obj can store it into Animal interface will consider as abstraction 
//with up-casting		
		System.out.println("*******Dog info*******");
		Dog d=new Dog();
		d.sound();
		d.eat();
		d.walk();
		d.run();
		Animal.breath();
		d.sleep();
		System.out.println("***************************");
		
		
		System.out.println("*******Cat info*******");
		Cat c=new Cat();
		c.sound();
		c.eat();
		c.walk();
		c.run();
		Animal.breath();
		System.out.println("***************************");
		
		System.out.println("*******monkey info*******");
		Monkey m=new Monkey();
		m.sound();
		m.eat();
		m.walk();
		m.run();
		Animal.breath();
		System.out.println("***************************");
	}

}
