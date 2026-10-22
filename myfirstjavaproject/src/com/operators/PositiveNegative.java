package com.operators;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		String result=(num >=0)?"Positive":"Negative";
		System.out.println("The number is:"+result);



	}

}
