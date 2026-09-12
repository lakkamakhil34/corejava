package com.oops.inheritance;

class Test1 {
	Test1(){
		System.out.println("No arg constructor called from Test1");
	}
}

class Test2 extends Test1{
	Test2(){
		System.out.println("No arg constructor called from Test2");
	}
}

class Test3 extends Test2{
	Test3(){
		System.out.println("No arg constructor called from Test3");
	}
}
public class TestInhDemo2 {

	public static void main(String[] args) {
		
		
	}

}
