package com.logicalstatements;

import java.util.Scanner;
//WAP to print cricketer info based in their jersey number..?
public class TestLSDemo5 {

	public static void main(String[] args) {

		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your favourite Jersey Number:");
		int jno=sc.nextInt();
		
		switch(jno) {
		case 3:
			System.out.println("Suresh Raina!!");
			System.out.println("Mr.Ipl");
			break;
		case 7:
			System.out.println("Mahendra Singh Dhoni!!");
			System.out.println("Captain Cool");
			break;
		case 18:
			System.out.println("Virat Kohli!!");
			System.out.println("Run Machine");
			break;
		case 1:
			System.out.println("K Lokesh Rahul!!");
			System.out.println("Classy");
			break;
		case 21:
			System.out.println("Sanju Samson!!");
			System.out.println("Chetta");
			break;
		case 9:
			System.out.println("Ravindra Singh Jadeja!!");
			System.out.println("Jaddu");
			break;
		case 96:
			System.out.println("Sreyas Iyer!!");
			System.out.println("Sarpanch Saab");
			break;
		default:
			System.out.println("unknown player from the List!!");
				
			
		}
		

		
		
	}

}
