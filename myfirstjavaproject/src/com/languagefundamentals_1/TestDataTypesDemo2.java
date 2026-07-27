package com.languagefundamentals_1;

import java.math.BigInteger;
import java.math.BigDecimal;

public class TestDataTypesDemo2 {
	
// Auto_boxing: converting primitive Data tpes to wrapper object data
// types	
	Integer i=50;// int to integer conversion is auto-boxing
	Character c='A';// char to character

//string:storing a collection of characters into a single variable
	//using double quotes
	String s= "Java";
	StringBuffer sb1= new StringBuffer("Java");
	StringBuilder sb2= new StringBuilder("Akhil");
	
	BigInteger bi1= new BigInteger("9862537638276218");
	BigInteger bi2= new BigInteger("9367352725276127");

	BigDecimal bd1= new BigDecimal("9836372827288755");
	BigDecimal bd2= new BigDecimal("8665432345678989");


	public static void main(String[] args) {
		System.out.println("main method started");
		
		Integer i2=100;
		Integer i3=100;
		
		System.out.println(i2==i3);//true
		
		Integer i4=200;
		Integer i5=200;
		System.out.println(i4==i5);//false
//bcz 200 is more than 127 so it takes two vales for two diff addresses		
		
		TestDataTypesDemo2 t1= new TestDataTypesDemo2();
		
//Auto-unboxing: wrapper object data types-->primitive data types
		//int a= t1.i;
		
		System.out.println(t1.i);
		System.out.println(t1.c);
		System.out.println(t1.s);
		System.out.println(t1.sb1);
		System.out.println(t1.sb2);
		System.out.println(t1.bi1);
		System.out.println(t1.bi2);
		System.out.println(t1.bd1);
		System.out.println(t1.bd2);
		
		System.out.println(t1.bi1.multiply(t1.bi2));
		System.out.println(t1.bd1.multiply(t1.bd2));
		
		System.out.println("main method ended");
		
		
		
		
	
	}

}
