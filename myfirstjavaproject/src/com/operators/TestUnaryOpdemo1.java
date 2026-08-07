package com.operators;

//unary op
// + - ++ --
//+--> unary +
//- --> unary -
//++ --> pre or post increment
//-- --> pre or post decrement
public class TestUnaryOpdemo1 {

	public static void main(String[] args) {
		
		int a=5;
		int b=6;
		
		System.out.println(+a);//5
		System.out.println(-b);//-6
		
		System.out.println(++a);//6
		System.out.println(--a);//5
		System.out.println(a++);//5-->6
		System.out.println(++a);//7
		System.out.println(a++);//7-->8
		System.out.println(++a);//9
		System.out.println(a--);//9-->8
		
		System.out.println("A value:"+a);
		System.out.println("B value:"+b);
		

	}

}
