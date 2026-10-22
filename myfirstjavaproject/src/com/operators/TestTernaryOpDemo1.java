package com.operators;

//trnary op
// ?  :
//syntax= (condition)?statement1:statement2;
//WAP to find the min number from a given two numbers?
//WAP the given number even or odd?
//WAP to find pass or fail based on marks?
//WAP to find max number from a given three numbers?

public class TestTernaryOpDemo1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int min=(a<b)?a:b;

		System.out.println("Minimum number:"+min);
		
		int c=5;
		String eo=(c % 2 == 0)?"even":"odd";
		System.out.println("Given number is:"+eo);
		
		int marks =40;
		String pf=(marks >= 35)?"pass":"fail";
		System.out.println("Result:"+pf);
		
		int x=23;
		int y= 34;
		int z=11;
		int max = (x > y)?(x > z ? x:z):(y>z?y:z);
		System.out.println("Maximum number is:"+max);
		
	}

}
