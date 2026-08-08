package com.logicalstatements;

import java.util.Scanner;

//WAP to validation checks for marriage like Matrimonal conditional checks.

public class TestLSDemo3 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Matrimonial-/-");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What is your Name:");
		String name=sc.nextLine();
		System.out.println("Nice to meet you Mr."+name);
		
		System.out.println("can you add your assets values here!");
		double assets=sc.nextDouble();
		
		System.out.println("What is your salary:");
		double salary=sc.nextDouble();
		
		if (assets >= 50000000.00 && salary >= 250000.00) {
			System.out.println("Okay good to go !");
			System.out.println("Enter your age:");
			int age = sc.nextInt();
			
			if(age >=27 && age <=29) {
				System.out.println("Let's Continue.....");
				
				System.out.println("Enter your Height:");
				float height=sc.nextFloat();
				
				System.out.println("Enter your weight:");
				double weight=sc.nextDouble();
				
				if ((height >=5.5 && height <= 6.0)&& weight >=65 && weight <=70) {
					System.out.println("Ok! Continue with the discussion");
					
					System.out.println("Do smoke or Drink...?");
					boolean habstatus=sc.nextBoolean();
					
					if(!habstatus) {
						System.out.println("Great to know!!Let's continue");
						
						System.out.println("Do you have siblings:");
						boolean sibStatus=sc.nextBoolean();
						
						if(!sibStatus) {
							System.out.println("Okay Good to know!!We will back soon!");
						}else {
							System.out.println("OMG!!");
						}
						
					}else {
						System.out.println("Sorry! You can leave...");
						
					}
				}else {
					System.out.println("You must need to join gym or your height is not matching with your profile");
				}

			}else {
				System.out.println("Your age is not matching with our profile!");
			}
			
		}else {
			System.out.println("You can Leave for the day !! Focus on your studies");
		}
		
	}

}
