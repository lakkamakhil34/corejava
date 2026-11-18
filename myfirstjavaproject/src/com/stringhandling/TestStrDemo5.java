package com.stringhandling;

import java.util.Scanner;

//wap to print string in reverse order..?
//wap to find the given string is a palindrome or not?
public class TestStrDemo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String rstr="";
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			rstr=c + rstr;
		}
		System.out.println("Reverse string of a given string is:" +rstr);
		if(str.equals(rstr)) {
			System.out.println("The Given String is Palindrome");
		}else {
			System.out.println("The Given String is not Palindrome");
		}
	}

}
