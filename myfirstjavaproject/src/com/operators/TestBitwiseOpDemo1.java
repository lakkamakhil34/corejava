package com.operators;

//bitwise op
// & | ^ ~
public class TestBitwiseOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println(~10);//-(n+1)
		
		
		System.out.println("*************Bitwise &**************");
		System.out.println(true&true);//true
		System.out.println(true&false);//false
		System.out.println(false&true);//false
		System.out.println(false&false);//false
		System.out.println("......................................");
		
		System.out.println(1 & 1);//1
		System.out.println(1 & 0);//0
		System.out.println(0 & 1);//0
		System.out.println(0 & 0);//0
		System.out.println("......................................");
		
		
		System.out.println(67 & 55);//3
		System.out.println(86 & 39);//6
		System.out.println(91 & 47);//11
		System.out.println(88 & 66);//64
		System.out.println("......................................");
		
		
		System.out.println("*************Bitwise |**************");
		System.out.println(true|true);//true
		System.out.println(true|false);//true
		System.out.println(false|true);//true
		System.out.println(false|false);//false
		System.out.println("......................................");
		
		
		System.out.println(1 | 1);//1
		System.out.println(1 | 0);//1
		System.out.println(0 | 1);//1
		System.out.println(0 | 0);//0
		System.out.println("......................................");
		
		
		System.out.println(67 | 55);//119
		System.out.println(86 | 39);//119
		System.out.println(91 | 47);//127
		System.out.println(88 | 66);//90
		System.out.println("......................................");
		
	
		System.out.println("*************Bitwise ^**************");
		System.out.println(true^true);//false
		System.out.println(true^false);//true
		System.out.println(false^true);//true
		System.out.println(false^false);//false
		System.out.println("......................................");
		
		System.out.println(1 ^ 1);//0
		System.out.println(1 ^ 0);//1
		System.out.println(0 ^ 1);//1
		System.out.println(0 ^ 0);//0
		System.out.println("......................................");
		
		
		System.out.println(67 ^ 55);//116
		System.out.println(86 ^ 39);//113
		System.out.println(91 ^ 47);//116
		System.out.println(88 ^ 66);//26
		System.out.println("......................................");
		
		
		
	}

}
