package com.oops.polymorphism;

public class TestDemo3 {

	void main(String[] args) {
		hello("Ak");
		//hello(null);// the method hello(integer)is ambiguous for the type TestDemo3

	}
	
	void hello(Integer name) {
		System.out.println("Hello Integer method called " + name);
	}

	void hello(String name) {
		System.out.println("Hello string method called " + name);
	}
	
	void hello(Object obj) {
		System.out.println("Hello Object method called " + obj);
	}
}
