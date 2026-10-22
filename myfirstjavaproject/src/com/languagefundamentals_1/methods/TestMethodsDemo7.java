package com.languagefundamentals_1.methods;

import java.util.Scanner;
//with return type+no arguments
public class TestMethodsDemo7 {
	
	Scanner sc=new Scanner(System.in);
	
	double thePrice(){
		double p=0;
		System.out.println("Price of the product:");
		p=sc.nextDouble();
		return p;
		
	}
	
	double getQuantity() {
		double q=0;
		System.out.println("The quantity is:");
		q=sc.nextDouble();
		return q;
	}

	void main(String[] args) {
		System.out.println("main method started");
		TestMethodsDemo7 t= new TestMethodsDemo7();
		
		double p=thePrice();
		double q=getQuantity();
		System.out.println("Total price of all Quantities:"+p*q);
	}

}
