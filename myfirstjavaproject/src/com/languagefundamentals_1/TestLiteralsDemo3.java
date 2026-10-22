package com.languagefundamentals_1;

public class TestLiteralsDemo3 {

	public static void main(String[] args) {
	
		String s=null;
		System.out.println(s);
		
		
		boolean status=false;
		if(status) {
			System.out.println("Good morning");
		}
		char c1='A';// single quote
		char c2=100;// ASCII
		char c3='\u0040';//uni-code or hex
		char c4=5678;// ASCII more than 127 is considered as junk characters
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
				
				
	}

}
