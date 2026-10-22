package com.languagefundamentals_1.constructors;

import java.util.Scanner;

class product{
	String brand="brand";
	String model="model";
	int year=2024;
	double price=25000;
	
	public product() {
		System.out.println("no arg constructor called from product");
	}
	public product(String brand,String model, int year,double price) {
		System.out.println("parameterised constructor called from product");
		this.brand=brand;
		this.model=model;
		this.year=year;
		this.price=price;
	}
	
	void productinfo(){
		System.out.println("Brand of the product:"+brand);
		System.out.println("Model of the product:"+model);
		System.out.println("Year of the product m:"+year);
		System.out.println("Price of the product:"+price);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
}


public class Tab extends product {

	public Tab() {
		System.out.println("no arg constructor called from Tab");
	}
	
     Tab(String brand,String model,int year,double price){
    	 super(brand,model,year,price);
    	 System.out.println("parameterised constructor called Tab");
	
}
	public static void main(String[] args) {
		System.out.println("main method started from Tab");
		Scanner sc=new Scanner(System.in);
		
		
		
	//Tab t=new Tab();
		//t.productinfo();
		
		Tab t1=new Tab("iphone","11pro",18,495000);
		t1.productinfo();
		
		System.out.println("main method ended from tab");
		

	}

}
