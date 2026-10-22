package com.logicalstatements.loops;

import java.util.Scanner;
//WAP to print the given number in a reverse order..?
//input:456
//output:654
public class TestLPDemo13 {

	 void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int rev=reverseNumber(n);
		
		System.out.println("The reverse number of a given number is:"+rev);

		if(n==rev) {
			System.out.println("The given number is Palindrome!!");
		}
		
		
 }
int reverseNumber(int n) {
	int rev=0;
	int r=0;
	
	while(n>0) {
		r=n%10;//456%10-->6
		n=n/10;//456/10-->45
		rev=rev*10+r;//6-->65-->654
	}
	return rev;
}
}
