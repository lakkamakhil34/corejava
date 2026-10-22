package com.operators;
//swapping without using temp variable
public class testSwappingDemo2 {

	public static void main(String[] args) {
		int a=15;
		int b=20;
		
		a=a+b;//35
		b=a-b;//15
		a=a-b;//20
		
		System.out.println("A value:"+a);
		System.out.println("B value:"+b);
	}

}
