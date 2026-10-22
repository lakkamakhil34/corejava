package com.logicalstatements;

import java.util.Scanner;
//WAP to check the hallticket eligibility of student

public class HallTicketEligibility {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Attendance %:");
		int attendance=sc.nextInt();
		System.out.println("Are your fees paid fully:");
		boolean fee =sc.nextBoolean() ;
		System.out.println("Are the Library books returned");
		boolean books=sc.nextBoolean();
		
		if (attendance >=75) {
			System.out.println("Welcome to TGBIE");
			System.out.println("Attendance is accepted");
		}else {
			System.out.println("Attendance is not accepted");
		}
		if (fee == true) {
			System.out.println("Fee paid:");
		}else {
			System.out.println("Fee not paid");
		}
		if(books==true) {
			System.out.println("Books  returned");
		}else {
			System.out.println("Books not returned");
		}
		if(attendance>75 && fee==true && books== true) {
			System.out.println("You are eligible to get Hallticket and write exam");
		}else {
			System.out.println("You are not eligible to get Hallticket");
		}
		System.out.println("main method ended");

	}

}
