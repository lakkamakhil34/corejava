package com.operators;

//Logical operators 
//&& || !-->the resulted values will give you the boolean exp
public class TestLogicalOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a=100;
		int b=150;
		int c=10;
		
		System.out.println("*************&&**************");
		System.out.println(true&&true);//true
		System.out.println(true&false);//false
		System.out.println(false&true);//false
		System.out.println(false&false);//false
		
//whenever the first condition is false will consider as false 
//and remaining will not be considered
	//CE:	System.out.println(10&&10);values not considered
		
		System.out.println("----------------------------------");
		
		System.out.println(a>b && b>c);//false
		System.out.println(a<b && b<c);//false
		System.out.println(a<b && b>c);//true
		System.out.println(a>b && b<c);//false
		
		System.out.println("*************||**************");
		System.out.println(true || true);//true 2nd part is dead code
		System.out.println(true || false);//true 2nd part is dead
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		
System.out.println("----------------------------------");
		
		System.out.println(a>b || b>c);//true
		System.out.println(a<b || b<c);//true
		System.out.println(a<b || b>c);//true
		System.out.println(a>b || b<c);//false
		System.out.println("----------------------------------");
		
		System.out.println(!true);
		System.out.println(!(a > c));//false
		
		
		
		int x=5; 
		int y=6;
		                  
		System.out.println(x++ > --y && ++x < ++y);//false
		System.out.println(++x > ++y || ++x < ++y);//false
		
		System.out.println("X value :"+x);
		System.out.println("Y value :"+y);
		

	}

}
