package com.arrays;

import java.util.Scanner;

public class DisplayMatrix {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		int[][]arr=new int[3][3];
		
		System.out.println("Enter matrix elements:");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
