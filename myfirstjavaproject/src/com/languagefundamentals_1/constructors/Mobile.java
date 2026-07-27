package com.languagefundamentals_1.constructors;

public class Mobile {
	
	String model;
	int yom;
	double price;
	String battery;
	String ram;
	
	Mobile(){
		System.out.println("no arg constructor called");
		model="oppo";
		yom=2026;
		price=25000.00;
		battery="6000mah";
		ram="8GB";
		
	}

	public Mobile(String model, int yom, double price, String battery, String ram) {
		super();
		this.model = model;
		this.yom = yom;
		this.price = price;
		this.battery = battery;
		this.ram = ram;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Mobile m1 = new Mobile();
		m1.Mobileinfo();
		

	}
	
	 void Mobileinfo() {
		System.out.println("Model:"+ model);
		System.out.println("Year of manufacture:"+yom);
		System.out.println("Price:"+price);
		System.out.println("Battery capacity:"+battery);
		System.out.println("RAM:"+ram);
		
		System.out.println("main method ended");
	}

}
