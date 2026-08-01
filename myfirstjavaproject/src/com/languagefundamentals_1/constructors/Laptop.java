package com.languagefundamentals_1.constructors;

public class Laptop {
	
	String brand;
	String model;
	double price;
	
	public Laptop() {
		System.out.println("no arg constructor called");
	}
	//copy constructor
	public Laptop(Laptop l) {
		System.out.println("Parameterised constructor called");
		this.brand=l.brand;
		this.model=l.model;
		this.price=l.price;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Laptop l1=new Laptop();
		l1.model="Intel graphics";
		l1.brand="dell";
		l1.price=55000.00;
		l1.Laptopinfo();

		Laptop l2=new Laptop(l1);
		l2.Laptopinfo();
		
		
		System.out.println("main method ended");
	}
	
	void Laptopinfo() {
		System.out.println("********************************");
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println("*********************************");
	}

}
