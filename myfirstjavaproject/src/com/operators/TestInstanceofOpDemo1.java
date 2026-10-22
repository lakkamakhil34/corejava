package com.operators;

class A{
	
}

class B extends A{
	
}
public class TestInstanceofOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Integer i=17;
		System.out.println(i instanceof Integer);//true
		System.out.println(i instanceof Number);//truee
		System.out.println(i instanceof Object);//true

//CE:		System.out.println(i instanceof String);
// incompatible conditional operand types integer and string
		System.out.println(null instanceof Integer);//false
//CE		System.out.println(i instanceof byte);
		
		A a =new A();
		B b=new B();
		A a1=new B();
		
		System.out.println(a instanceof A);
		System.out.println(b instanceof B);
		System.out.println(a1 instanceof B);
		System.out.println(b instanceof A);
		System.out.println(a instanceof B);
		
		
	}

}
