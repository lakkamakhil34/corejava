package com.stringhandling;

public class TestStrDemo6 {

	public static void main(String[] args) {
		
		String str="Java is simple";
		System.out.println(str.codePointAt(1));
		System.out.println(str.codePointBefore(3));
		
		System.out.println(str.codePointCount(3, 10));
		
		String str1="Eclipse";
		String str2="Energy";
		String str3="Windows";
		String str4="Windows";
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str3));
		System.out.println(str3.compareTo(str4));
		System.out.println(str3.compareToIgnoreCase(str4));
		
		System.out.println("**************************************");
		int i=10;
		int i1=20;
		
		String a="Vcube";
		String b="JFS";
		
		System.out.println(a.concat(b));
		System.out.println(a+i1+i);
		System.out.println(a+b);


		

	}

}
