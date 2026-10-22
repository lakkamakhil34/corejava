package com.languagefundamentals_1.constructors;

public class Product {
	
	int productId;
	String productName;
	double price;
	
	
	Product(int productId, String productName, double price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		
		}
	
	
	void display() {
		System.out.println("ProductId:"+productId);
		System.out.println("Product name:"+productName);
		System.out.println("Price:"+price);
		
	}

	public static void main(String[] args) {
		Product p1=new Product(1,"Mobile",25000.00);
		Product p2=new Product(2,"Earbuds", 2000.00);
		Product p3=new Product(3,"Charger", 2000.00);
		Product p4=new Product(4,"Mouse", 200.00);
		Product p5=new Product(5,"keyboard", 350.00);
		
p1.display();
p2.display();
p3.display();
p4.display();
p5.display();


	}

}
