package com.accessmodifiers01;

public class TestAccessDemo2 {

	public static void main(String[] args) {
		System.out.println("static block called from TestAccessDemo2");
//the constructor TestAccessDemo2()is not visible if the constructor 
//is private.
		TestAccessDemo1 t1=new TestAccessDemo1();
		
//We cannot access private data members outside of the classes.
//		System.out.println(t1.a1);//The field TestAccessDemo1.a1 is not visible
//		System.out.println(t1.name1);The field TestAccessDemo1.name1 is not visible
//		t1.method1();The field TestAccessDemo1 is not visible

	 System.out.println("*********************");
	//accessing the default data members within the class
		
	 	System.out.println(t1.a2);
	 	System.out.println(t1.name2);
		t1.method2();
				
	System.out.println("*********************");
	//accessing the default data members within the class
				
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();
				
		 System.out.println("*********************");		
	//accessing the protected data members within the class
			
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();
							
		
	}

}
