package com.arrays;

import java.util.Scanner;

//WAP to check whether the given element is available or not in an array.?

public class TestArrDemo8 {

	public static void main(String[] args) {
		
		int[]arr= {18,7,3,45,21,1,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int search=sc.nextInt();
		boolean status=false;
		
		for(int a:arr) {
			if(a==search) {
				System.out.println("The player is found:"+a);
				status=true;
				break;
			}
		}
		if(!status) {
			System.out.println("The player is not found!"+search);
		}
	}

}
