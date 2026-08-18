package com.logicalstatements.loops;

import java.util.Scanner;

public class FirstNprimenumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter N:");
		int n=sc.nextInt();
		
		int count=0;
		int num=2;
		
		while(count<n) {
			int factors =0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					factors++;
				}
			}
			if(factors==2) {
				System.out.println(num+"");
				count++;
			}
			num++;
		}
	}

}
