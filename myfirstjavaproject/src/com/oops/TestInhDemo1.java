package com.oops;

public class TestInhDemo1 {
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("finalize method called");
	}
	@Override
	public String toString() {
		return "Employee Info[ID :"+ id +",Name:"+name;
	}
	
	int id=1;
	String name="Warner";
	
	TestInhDemo1(){
		super();
	}
	void show() {
		System.out.println("show method called:"+this.getClass());
	}

	public static void main(String[] args) {

		TestInhDemo1 t=new TestInhDemo1();
		System.out.println(t);
		TestInhDemo1 t1=new TestInhDemo1();
		System.out.println(t1);
		
		TestInhDemo1 t2=new TestInhDemo1();
		t2=t1;
		
		int tIn=0x2b2fa4f7;
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println("***************************");
		
		
		
		System.gc();
		System.out.println(t.equals(t1));
		System.out.println(t1.equals(t2));
		System.out.println(t1==t2);
		

	}

}
