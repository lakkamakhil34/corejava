package com.logicalstatements;

import java.util.Scanner;

///Nested switch cases
//WAP to get details about vegetables&fruits from vegetable market!!

public class TestLSDemo7 {

	public static void main(String[] args) {
		System.out.println("main method strtes");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter category");
		String catg=sc.next();
		double vegprice=0;
		double fruitprice=0;
		
		switch(catg) {
		
		case"veg"->{
			System.out.println("Enter a Item:");
			String item=sc.next();
			
			switch(item) {
			case "ptt"-> {
				System.out.println("Potato per kg=50rs");
				double pttprice=50.0;
				vegprice=vegprice+pttprice;
			}
			
			case "tmt"-> {
				System.out.println("Tomato per kg=50rs");
				double tmtprice=50.0;
				vegprice=vegprice+tmtprice;
			}
			
			case "crt"-> {
				System.out.println("Carrot per kg=70rs");
				double crtprice=70.0;
				vegprice=vegprice+crtprice;
			}
			
			case "ldf"-> {
				System.out.println("Ladysfinger per kg=30rs");
				double ldfprice=30.0;
				vegprice=vegprice+ldfprice;
			}
			
			case "btg"-> {
				System.out.println("Bittergourd per kg=40rs");
				double btgprice=40.0;
				vegprice=vegprice+btgprice;
			}
			
			case "gngr"-> {
				System.out.println("Ginger per kg=150rs");
				double gngrprice=150.0;
				vegprice=vegprice+gngrprice;
			}
			
			case "gc"-> {
				System.out.println("Green chilli per kg=50rs");
				double gcprice=50.0;
				vegprice=vegprice+gcprice;
			}
			
			case "on"-> {
				System.out.println("Onions per kg=60rs");
				double onprice=60.0;
				vegprice=vegprice+onprice;
			}
			default->{
				System.out.println("Invalid vegetable code!!");
			}
			}
			
		}
		
		case "fruit"->{
			System.out.println("Enter item:");
			String item=sc.next();
			
			switch(item) {
			
			case "app"->{
				System.out.println("Apples per kg=100rs");
				double appprice=100.0;
				fruitprice=fruitprice+appprice;
			}
			case "grps"->{
				System.out.println("Grapes per kg=70rs");
				double grpsprice=70.0;
				fruitprice=fruitprice+grpsprice;
			}
			case "bna"->{
				System.out.println("Banana per kg=100rs");
				double bnaprice=100.0;
				fruitprice=fruitprice+bnaprice;
			}
			case "orn"->{
				System.out.println("Oranges per kg=80rs");
				double ornprice=80.0;
				fruitprice=fruitprice+ornprice;
			}
			case "pmg"->{
				System.out.println("Pomegranate per kg=60rs");
				double pmgprice=60.0;
				fruitprice=fruitprice+pmgprice;
			}
			case "mgs"->{
				System.out.println("mangoes per kg=150rs");
				double mgsprice=150.0;
				fruitprice=fruitprice+mgsprice;
			}
			default->{
				System.out.println("Invalid fruit code");
				
			} 
		    
			
			
			}

		}
		
		}
		
		
		System.out.println("Total vegprice:"+vegprice);
		System.out.println("Total fruitprice:"+fruitprice);
		
		
	}

}
