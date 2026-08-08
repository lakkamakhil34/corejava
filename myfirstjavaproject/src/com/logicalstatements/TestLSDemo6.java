package com.logicalstatements;

import java.util.Scanner;

///Small calculator
/// WAP to print the result of two numbers based on the given symbol..?
public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		String yn="";
		
		do {
			System.out.println("Enter a number: ");
			int a=sc.nextInt();
			
			System.out.println("Enter b number: ");
			int b=sc.nextInt();
			
			System.out.println("Enter a symbol");
			String symb=sc.next();
			
			
			switch(symb) {
			
			case "+" ->System.out.println(a+b);
	        case "-"->System.out.println(a-b);
	        case "*"->System.out.println(a*b);
			case "/"->System.out.println(a/b);
			case "%"->System.out.println(a%b);
						
			default->System.out.println("Entered unknown symbol to proceed!!");
					
			}
			
			System.out.println("Do you want to continue..? Click Y for Yes N for No:");	
			yn=sc.next();
			
			}while(yn.equalsIgnoreCase("Y"));
		
		    System.out.println("Exit!");
		
	}

}
