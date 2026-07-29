package com.languagefundamentals_1.constructors;

public class Car {
	
	String brand;
	String model;
	int year;
	String colour;
	double price;
	
	public Car() {
		this("unknown","unknown");
	}

	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}


	public Car(String brand, String model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}


	public Car(String brand, String model, int year, String colour, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.colour = colour;
		this.price = price;
	}

	public static void main(String[] args) {
	System.out.println("main method started");
	Car c=new Car();
	c.Carinfo();
	
	Car c1=new Car("KIA","Sonet");
	c1.Carinfo();
	
	Car c2=new Car("KIA","Sonet",2025);
			c2.Carinfo();
			
			Car c3=new Car("kia","sonet", 2025, "White", 1450000);
			c3.Carinfo();
			
			
	}

	void Carinfo() {
		System.out.println("Brand of car:"+brand);
		System.out.println("Model of car:"+model);
		System.out.println("year:"+year);
		System.out.println("Colour of car:"+colour);
		System.out.println("Price of car:"+price);
		System.out.println("*******************************");
	}
}
