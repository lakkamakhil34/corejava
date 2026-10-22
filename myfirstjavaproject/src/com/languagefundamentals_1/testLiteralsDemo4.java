package com.languagefundamentals_1;


//Note: If the data is primitive "=="operator always checks the values but not addresses
//If values are the same then will return true.

//if the data is object type"==" operator alays checks the addresses of the objects
//if we want to check the values of string objects we must need to use
//.equals or .equalsignoreCase()

public class testLiteralsDemo4 {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		int c=20;
		
		
		System.out.println(a==b);
		System.out.println(a==c);
		
		String s1= "Vcube";// string literals--> 1object
		String s2=new String("Java");// new objects-->2 objects
		
		String s3="Vcube";//0 0bjects
		String s4=new String("Java");// 1 in Heap
		
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		
		
	}

}
