package com.languagefundamentals_1.constructors;

import java.util.Scanner;

public class ProductBilling {

	String productName;
	double price;
	int quantity;
	
	ProductBilling(){
		this("unknown");
	}
	
	ProductBilling(String productName){
		this(productName, 0.0);
	}
	
	ProductBilling(String productName, double price){
		this(productName,price,0);
		
	}
	
  ProductBilling(String productName, double price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		 double totalcost=price*quantity;
		 
		 System.out.println("Product name:"+productName);
		 System.out.println("Price of the product:"+price);
		 System.out.println("Quantity of the product:"+quantity);
		System.out.println("Total cost:"+totalcost);
	}

	public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Product name:");
	String productName=sc.next();
	
	System.out.println("Price of the quantity");
	double price=sc.nextDouble();
	
	System.out.println("Quantity:");
	int quantity=sc.nextInt();
	
	ProductBilling p=new ProductBilling(productName,price,quantity);
		sc.close();
	}

	
}
