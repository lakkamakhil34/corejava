package com.stringhandling;

public class StringDemo {
	private final String str;
	
	public StringDemo(String str) {
		this.str = str;
	}
	
	public String get() {
		return str;
	}



	public static void main(String[] args) {
		StringDemo s1=new StringDemo("Java");
		System.out.println(s1.str);
		
		StringDemo s2=new StringDemo("Springboot");
		System.out.println(s2.str);
		
		

	}

}
