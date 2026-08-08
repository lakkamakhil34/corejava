package com.logicalstatements.loops;

///WAP to print even numbers &odd numbers?
public class TestLPDemo2 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		//even numbers
		for (int i=0;i <= 50; i++) {
			if(i!=0 && i%2==0)
			System.out.println(i + "");
			
			
		}
		System.out.println("################################");
		//odd numbers
		for (int i=0;i <= 50; i++) {
			if(i!=0 && i%2==1)
			System.out.println(i + "");
			
			
		}
		
	}

}
