package com.oops.abstraction;

interface In1{
	void method1();
	void method2();
	
	default void method4() {
		System.out.println("method4 called from In1");
	}
}

interface In2 extends In1{
	void method2();
	void method3();
	default void method4() {
		System.out.println("method4 called from In2");
	}
}

interface In3 extends In1,In2{
	@Override
	default void method4() {
		In2.super.method4();
	}
}
//how java is supporting multiple  inheritance,because in interfaces we have only
//declaration but from implementation class, here it is unique implementation, so 
//there is no ambiguity the functionalities 

class Test1 implements In3{

	@Override
	public void method1() {
		System.out.println("method1 called");
		
	}

	@Override
	public void method2() {
		System.out.println("method2 called");
		
	}

	@Override
	public void method3() {
		System.out.println("method3 called");
		
	}
	
	@Override
	public void method4() {
		In3.super.method4();
		
	}
	
}
public class TestDemo1 {

	public static void main(String[] args) {
		In3 i=new Test1();
		i.method1();
		i.method2();
		i.method3();
		i.method4();
		

	}

}
