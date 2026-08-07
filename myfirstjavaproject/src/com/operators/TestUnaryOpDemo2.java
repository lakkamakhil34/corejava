package com.operators;

public class TestUnaryOpDemo2 {

	public static void main(String[] args) {
	
		int a=5;
		int b=5;
		
		System.out.println(a--);//5-->4
		System.out.println(--a);//3
		System.out.println(b--);//5-->4
		System.out.println(b--);//4-->3
		System.out.println(a++);//3-->4
		System.out.println(a++);//4-->5
		System.out.println(b--);//3-->2
		System.out.println(--b);//1
		System.out.println(--b);//0
		System.out.println(a++);//5-->6
		System.out.println(b++);//0-->1
		System.out.println(a--);//6-->5
		
		System.out.println(a+ b);//6
		System.out.println(a- b);//4
		
		System.out.println("A value:"+a);//5
		System.out.println("B value:"+b);//1
		
		System.out.println(++a + ++b + --a + ++b);//16
		System.out.println(a++ + b++ - ++a - --b);
	
	}

}
