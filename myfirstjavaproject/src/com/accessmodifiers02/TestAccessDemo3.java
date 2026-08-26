package com.accessmodifiers02;

import com.accessmodifiers01.TestAccessDemo1;

public class TestAccessDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");

		TestAccessDemo1 t1=new TestAccessDemo1();
		
		
// Even though, your class is public,constructor is public, you imported class
//but, your data members are default so we cannot access outside of the packages.		

	//accessing the public data members outside the packages		
				System.out.println(t1.a2);
				System.out.println(t1.name2);
				t1.method2();
		
		
		
//accessing the public data members outside the packages		
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		
		
	}

}
