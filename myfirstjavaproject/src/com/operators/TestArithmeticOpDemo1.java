package com.operators;

//1)Arithmetic operators
//+ - * / %
public class TestArithmeticOpDemo1 {

	public static void main(String[] args) {
		

		int a=20;
		int b=30;
		
		int c=20;
		int d=2;
		
	//String+ anything is string,here first +is working like a concatination
		//System.out.println("Addition of two number:"+a+b);//concat=2030
		//BODMAS
		System.out.println("Addition of two number:"+(a+b));
		//System.out.println("Difference of two numbers:"+a-b);CE
		System.out.println("Difference of two numbers:"+(a-b));
		System.out.println("Multiplication of two numbers:"+a*b);
		//division-->quotient 2)20(1
  //                            2
 //                           -----
		System.out.println("Division of two numbers:"+c/d);
		//modulus-->remainder
		System.out.println("Modulus of two numbers:"+c%d);
		
		System.out.println(5*2/3);
		System.out.println(10*5/2);
	}

}
