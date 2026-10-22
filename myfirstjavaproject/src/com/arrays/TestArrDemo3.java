package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Read the size & elements from the console using Scanner
public class TestArrDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size:");
		int size=sc.nextInt();
		
		int[] numbers=new int[size];//10-->0-9

		System.out.println("Enter the elements:");
		for(int i=0;i< size;i++) {
			numbers[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(numbers[i]%2==0) {
				System.out.println(numbers[i]);
			}
			
		}
		System.out.println(Arrays.toString(numbers));


	}

}
