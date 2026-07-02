package com.languagefundamentals_1;

public class TestIdentifiersDemo1 {

	int id1=101;
	String name_1="Arjun";
	
	void method$_1(){
		
		System.out.println("Hello method1");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		TestIdentifiersDemo1 t= new TestIdentifiersDemo1();
		
		System.out.println(t.id1);
		System.out.println(t.name_1);
		
		t.method$_1();
		System.out.println("main method ended");
	}

}
