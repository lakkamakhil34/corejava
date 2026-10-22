package com.logicalstatements.loops;

import java.util.Scanner;

//Q)WAP to convert decimal to binary value..?
public class TestLPDemo17 {

	void decimaltoBinary(int n) {
		int r=0;
		String binVal="";
		
		while(n>0) {
			r=n%2;//18%2->0,9%2->1,4%2->0,2%2->0,1%2=1
			n=n/2;//18/2->9,9/2->4,4/2->2,2/2->1,1/2->0
			binVal=r+binVal;//10010
		}
		System.out.println("The binary value of given number is:"+binVal);
	}
	void main(String[] args) {
          System.out.println("main method started ");
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number:");
          int n=sc.nextInt();
          
          decimaltoBinary(n);
		

		
	}

}
