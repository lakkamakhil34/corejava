package com.oops.polymorphism;

public class TestDemo5 {

	 void main(String[] args) {
		System.out.println("main method started");

		add("A",10,20);
		add("B",20,10,30);
		add("C",20,10,30,40);
		add("D",20,10,30,40,50);
		add("E",10,20,30,40,70,80);
		
		add(10,2);
		
		System.out.println("main method ended");
		
		
	}
	 
	 //var arg:variable arguments
	 //int..a==>int[]a
	//The variable argument type int of the method add must be the last parameter 
	 void add(String s,int...a) {
		 int sum=0;
		 for(int a1:a) {
			 sum=sum+a1;
		 }
		 System.out.println("Sum:"+sum+"->"+s);
	 }
	 
	 void add(int a, int b) {
		 System.out.println("add with two args");
		 int sum=a+b;
		 System.out.println("Sum:"+sum);
	 }
	 
	 
	 
	 
//	void add(int a, int b) {
//		System.out.println("add with two arg called");
//		int sum= a+b;
//		System.out.println("Sum: "+sum);
//	}
//	
//	void add(int a, int b, int c){
//		System.out.println("add with three arg called");
//		int sum=a+b+c;
//		System.out.println("Sum: "+sum);
//	}
//	
//	void add(int a, int b, int c,int d){
//		System.out.println("add with four arg called");
//		int sum=a+b+c+d;
//		System.out.println("Sum: "+sum);
//	}
//	void add(int a, int b, int c, int d, int e){
//		System.out.println("add with five arg called");
//		int sum=a+b+c+d+e;
//		System.out.println("Sum: "+sum);
//	}
//	void add(int a, int b, int c, int d, int e, int f){
//		System.out.println("add with six arg called");
//		int sum=a+b+c+d+e+f;
//		System.out.println("Sum: "+sum);
//	}
}
