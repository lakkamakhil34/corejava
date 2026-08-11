package com.logicalstatements.loops;
import java.util.Scanner;

///the fibonacci series is a series of numbers where each number starting
/// from 0 &1 .
///The sequence series progresses as:0,1,1,2,3,5,8,13 and so on.

public class TestLPDemo9 {

	public static void main(String[] args) {

		System.out.println("main method started");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many numbers you want to print:");
		int n=sc.nextInt();
		fibbonacciseries(n);
		
		System.out.println("main method ended");
		
	}

	static void fibbonacciseries(int n) {
		int n1=0;
		int n2=1;
		
		System.out.print(n1+" "+n2+" ");
		int n3=0;
		
		for(int i=1; i<=n-2;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}
