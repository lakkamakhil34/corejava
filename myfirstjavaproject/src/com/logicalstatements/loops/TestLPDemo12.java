package com.logicalstatements.loops;
import java.util.Scanner;
//WAP to print sum of the digits of a given number..?
//input:345-->5678-->9
//output:number-->12-->26-->9
public class TestLPDemo12 {
	
	static int sumofDigits(int n) {
		int sum=0;
		int r=0;
		
		while (n>0) {
			r=n%10;//3,123%10-->2,1%10-->1
			n=n/10;//12, 12/10-->1,1/10--0
			sum=sum+r;//3+2=5+1=6
		}
		
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int sum= sumofDigits(n);
		System.out.println("Sum of all the digits from given number is:"+sum);
		
				

	}

}
