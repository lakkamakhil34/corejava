package com.javaintro;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("main");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		int square=num*num;
		int t=square;
		int sum=0;
		
		while(t>0) {
			int digit=t%10;
			sum=sum+digit;
			t=t/10;
		}
		
		if(sum==num) {
			System.out.println("It is a Neon number");
		}else {
			System.out.println("It is not a Neon number");
		}
		
	}

}
