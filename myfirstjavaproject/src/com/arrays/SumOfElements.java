package com.arrays;

public class SumOfElements {

	public static void main(String[] args) {

		int []numbers;
		numbers=new int[5];
		
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;
		
		int sum=0;
		System.out.println("Sum of Numbers:");
		
		for(int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
		System.out.println("Sum="+sum);

	}

}
