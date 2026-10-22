package com.logicalstatements.loops;

import java.util.Scanner;
public class MovieTicket {

	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	while (true) {

	System.out.println("Select Ticket Type:");
	System.out.println("1. Silver - Rs.200");
	System.out.println("2. Gold - Rs.300");
	System.out.println("3. Platinum - Rs.500");
	System.out.println("4. Exit");

	System.out.print("Enter your choice: ");
	int choice = sc.nextInt();

	if (choice == 4) {
	System.out.println("Thank you! Visit Again.");
	break;
	}

	System.out.print("Enter your age: ");
	int age = sc.nextInt();

	double price = 0;
	String ticketType = "";

	switch (choice) {

	case 1:
	ticketType = "Silver";
	price = 200;

	if (age >= 60) {
	price = price - (price* 10 / 100);
	}
    break;

	case 2:
	ticketType = "Gold";
	price = 300;

	if (age >= 60) {
	price = price - (price * 10 / 100);
	}

	break;

	case 3:
	ticketType = "Platinum";
	price = 500;

	if (age >= 60) {
	price = price - (price * 10 / 100);
	}

	break;

	default:
	System.out.println("Invalid choice!");
	continue;
	}

	System.out.println(" Ticket Price: Rs." + price);
	}

	
	}
	}

