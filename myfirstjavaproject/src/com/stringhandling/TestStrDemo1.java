package com.stringhandling;

public class TestStrDemo1 {

	public static void main(String[] args) {
		
		String str1="Java";//String literal
		String str5="Java";
		
		String str2=new String("Vcube");//String new keyword
		String str6=new String("Vcube");
		
		String str3="vcube"+"Java";//concatenation
		
		String str4=str3;//re-assigning the object
		
		
		System.out.println(str2);
		System.out.println(str6);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str5));
		
		
	}

}
