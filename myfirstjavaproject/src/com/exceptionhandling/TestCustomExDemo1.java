package com.exceptionhandling;

import java.util.Scanner;

public class TestCustomExDemo1 {
	
	static void hello() {
		System.out.println("hello");
	}

	public static void main(String[] args) throws AkhilException {
		System.out.println("main method targeted");
		hello();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int age= sc.nextInt();
		
		if(age>18) {
			System.out.println("You are eligible for ArjunReddy Movie");
			System.out.println("Your eligible for voting");
		}else {
			throw new AkhilException("Babu niku inka time undhi nanaa");
		}

	}

}
