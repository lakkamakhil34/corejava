package com.operators;

// comparison op-->will give the result value as boolean expression
// == <= >= < > !=
//== operator checks the values if the data is primitive data
//but == operatorchecks the addresses, if the data is object data types
public class TestComparisonOpDemo1 {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		int c=10;
		
		
		String s1= "Akhil";
		String s2= new String("Akhil");
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println(a == b);//false
		System.out.println(b == c);//true
		
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		
		System.out.println(a <= b);//true
		System.out.println(a >=b );//false
		System.out.println(b>=c);//true
		System.out.println(b<=c);//true
		

	}

}
