package com.accessmodifiers01;

//private is illegal modifier for the class TestAccessDemo1;
//only public, <default>,abstract,strictfp&final are permitted

//when strictfp we willl get Warning:floating point expressions
//are always strictly evaluated from sourcelevel 17

public class TestAccessDemo1 {
	
	static {
		System.out.println("static block called from TestAccessDemo1");
	}
    {
		System.out.println("instance block called from TestAccessDemo1");
	}
    
  //protected data members
  	protected int a4=1;
  	protected String name4="Rahul";
  			
  	protected void method4() {
  		System.out.println("method4 called");
  			
  	}		
	//public data members
	public int a3=3;
	public String name3="Raina";
			
	public void method3() {
		System.out.println("method3 called");
			
	}		
			
	//default data members
	int a2=45;
	String name2="Rohit";
		
	void method2() {
		System.out.println("method2 called");
		
	}		
		
	
	//private data members
	private int a1=18;
	private String name1="Virat";
	

	private void method1() {
		System.out.println("method1 called");
	}
	
	//no-arg cons
	public TestAccessDemo1(){
		System.out.println("no-arg constructor called");
	}

	public static void main(String[] args) {
		TestAccessDemo1 t1=new TestAccessDemo1();
		
		//accessing the private data members within the class
		
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();
		
		System.out.println("*********************");
	//accessing the default data members within the class
		
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();
				
	   System.out.println("*********************");
	//accessing the public data members within the class
				
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
